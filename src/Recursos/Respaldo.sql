--
-- PostgreSQL database dump
--

-- Dumped from database version 13.5
-- Dumped by pg_dump version 15.0

-- Started on 2023-08-17 09:50:16

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 5 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: AH1819
--

-- *not* creating schema, since initdb creates it


ALTER SCHEMA public OWNER TO "AH1819";

--
-- TOC entry 237 (class 1255 OID 74134)
-- Name: fimporte(); Type: FUNCTION; Schema: public; Owner: AH1819
--

CREATE FUNCTION public.fimporte() RETURNS trigger
    LANGUAGE plpgsql
    AS $$
DECLARE

  ftarifa double precision;
  fdeuda double precision;
  fabonox double precision;
  flectura_fin double precision;
BEGIN

IF TG_OP = 'INSERT' THEN

if new.costo_fijo is false then

	SELECT a.tarifa into ftarifa
	FROM det_tipoconsumo_tarifa a
	INNER JOIN contrato b on (a.id_consumo=b.id_consumo and a.consec=b.consec)
	WHERE b.folio_contrato = NEW.folio_contrato;

	NEW.importe := NEW.consumo * ftarifa;
else 
	select lectura_fin into flectura_fin from lectura_pago where id_lect_pago= 
	(select max(id_lect_pago) from lectura_pago where folio_contrato= new.folio_contrato);

	new.lectura_ini:=flectura_fin;
	new.lectura_fin:=flectura_fin;

end if;


new.pagado=0;
NEW.adeudo   = NEW.importe;

SELECT deuda into fdeuda
FROM contrato WHERE folio_contrato = NEW.folio_contrato;

if fdeuda is null then 
	fdeuda=0;
end if;

UPDATE contrato SET deuda = NEW.importe + fdeuda 
WHERE folio_contrato = NEW.folio_contrato;


ELSEIF TG_OP = 'UPDATE' THEN

SELECT deuda into fdeuda FROM contrato WHERE folio_contrato = NEW.folio_contrato;

SELECT adeudo into fabonox FROM lectura_pago WHERE id_lect_pago = NEW.id_lect_pago;

fabonox:=fdeuda-(fabonox-NEW.adeudo);

UPDATE contrato SET deuda = fabonox WHERE folio_contrato = NEW.folio_contrato;

END IF;

RETURN new;
 
END;
$$;


ALTER FUNCTION public.fimporte() OWNER TO "AH1819";

--
-- TOC entry 224 (class 1255 OID 74135)
-- Name: fn_abono(); Type: FUNCTION; Schema: public; Owner: AH1819
--

CREATE FUNCTION public.fn_abono() RETURNS trigger
    LANGUAGE plpgsql
    AS $$
DECLARE
  fstatus text;
 fimporte double precision;
 fpagado double precision;
fadeudo double precision;
fsaldo double precision;
BEGIN
SELECT l.importe into fimporte
FROM lectura_pago l
WHERE l.id_lect_pago = NEW.id_lect_pago;
--deudo into fsaldo
SELECT pagado, adeudo, status into fpagado, fadeudo, fstatus
FROM lectura_pago 
WHERE id_lect_pago = NEW.id_lect_pago;
if fpagado is null then 
fpagado:=0;
end if;
raise notice ' valor de adeudo % %',fadeudo, new.abono;
fadeudo:= fadeudo-new.abono;
raise notice ' valor de adeudo % ',fadeudo;
if fadeudo = fimporte then
NEW.saldo := fadeudo;
fstatus:= 'Pendiente';
end if;
if fadeudo > 0 then
fstatus:= 'En Proceso';
NEW.saldo := fadeudo;
end if;
if fadeudo = 0 then
fstatus:= 'Pagado';
NEW.saldo := fadeudo;
end if;
UPDATE lectura_pago set pagado = NEW.abono + fpagado, adeudo= fadeudo, status = fstatus
where id_lect_pago = NEW.id_lect_pago;
RETURN new;
END;

$$;


ALTER FUNCTION public.fn_abono() OWNER TO "AH1819";

--
-- TOC entry 236 (class 1255 OID 74345)
-- Name: importe(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.importe() RETURNS trigger
    LANGUAGE plpgsql
    AS $$
  DECLARE
  ftarifa double precision;
  fdeuda double precision;
  fabonox double precision;
  BEGIN
		
		IF TG_OP = 'INSERT' THEN
		 
		
			insert into validar(sql) values (new.importe::text);

			if new.costo_fijo is false then


				SELECT a.tarifa into ftarifa
					from det_tipoconsumo_tarifa a
					inner join contrato b on (a.id_consumo=b.id_consumo and a.consec=b.consec)
					WHERE b.folio_contrato = NEW.folio_contrato;

					NEW.importe := new.consumo* ftarifa;
			
			end if;


			insert into validar(sql) values (new.importe::text);
			
			--new.pagado=0;
			new.adeudo=new.importe;
			
			SELECT deuda into fdeuda
				from contrato WHERE folio_contrato = NEW.folio_contrato;

			UPDATE contrato SET deuda = NEW.importe+fdeuda WHERE folio_contrato = NEW.folio_contrato;
		




		elseif TG_OP = 'UPDATE' THEN

			SELECT deuda into fdeuda from contrato WHERE folio_contrato = NEW.folio_contrato;

			select adeudo into fabonox from lectura_pago where id_lect_pago = NEW.id_lect_pago;
			
			fabonox:=fdeuda-(fabonox-new.adeudo);
			

			UPDATE contrato SET deuda = fabonox WHERE folio_contrato = NEW.folio_contrato;
		
		end if;
		
		
		
 
      RETURN new;
  END;
$$;


ALTER FUNCTION public.importe() OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 200 (class 1259 OID 74136)
-- Name: cat_consumo; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.cat_consumo (
    id_consumo integer NOT NULL,
    tipo_consumo character varying
);


ALTER TABLE public.cat_consumo OWNER TO "AH1819";

--
-- TOC entry 201 (class 1259 OID 74142)
-- Name: cat_consumo_id_consumo_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.cat_consumo_id_consumo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cat_consumo_id_consumo_seq OWNER TO "AH1819";

--
-- TOC entry 3140 (class 0 OID 0)
-- Dependencies: 201
-- Name: cat_consumo_id_consumo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.cat_consumo_id_consumo_seq OWNED BY public.cat_consumo.id_consumo;


--
-- TOC entry 202 (class 1259 OID 74144)
-- Name: cat_descuento; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.cat_descuento (
    id_desc integer NOT NULL,
    fecha_inc date,
    fecha_fin date,
    descripcion text,
    porcentaje double precision,
    status character varying DEFAULT 'Activo'::character varying
);


ALTER TABLE public.cat_descuento OWNER TO "AH1819";

--
-- TOC entry 203 (class 1259 OID 74150)
-- Name: cat_descuento_id_desc_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.cat_descuento_id_desc_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cat_descuento_id_desc_seq OWNER TO "AH1819";

--
-- TOC entry 3143 (class 0 OID 0)
-- Dependencies: 203
-- Name: cat_descuento_id_desc_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.cat_descuento_id_desc_seq OWNED BY public.cat_descuento.id_desc;


--
-- TOC entry 204 (class 1259 OID 74152)
-- Name: cat_mes; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.cat_mes (
    id_m integer NOT NULL,
    mes character varying
);


ALTER TABLE public.cat_mes OWNER TO "AH1819";

--
-- TOC entry 205 (class 1259 OID 74158)
-- Name: cat_mes_id_m_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.cat_mes_id_m_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cat_mes_id_m_seq OWNER TO "AH1819";

--
-- TOC entry 3146 (class 0 OID 0)
-- Dependencies: 205
-- Name: cat_mes_id_m_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.cat_mes_id_m_seq OWNED BY public.cat_mes.id_m;


--
-- TOC entry 206 (class 1259 OID 74160)
-- Name: cat_pago; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.cat_pago (
    id_tipo_pago integer NOT NULL,
    tipo_pago character varying
);


ALTER TABLE public.cat_pago OWNER TO "AH1819";

--
-- TOC entry 207 (class 1259 OID 74166)
-- Name: cat_pago_id_tipo_pago_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.cat_pago_id_tipo_pago_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cat_pago_id_tipo_pago_seq OWNER TO "AH1819";

--
-- TOC entry 3149 (class 0 OID 0)
-- Dependencies: 207
-- Name: cat_pago_id_tipo_pago_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.cat_pago_id_tipo_pago_seq OWNED BY public.cat_pago.id_tipo_pago;


--
-- TOC entry 208 (class 1259 OID 74168)
-- Name: cat_periodo; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.cat_periodo (
    id_periodo integer NOT NULL,
    tipo_periodo character varying,
    meses integer
);


ALTER TABLE public.cat_periodo OWNER TO "AH1819";

--
-- TOC entry 209 (class 1259 OID 74174)
-- Name: cat_periodo_id_periodo_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.cat_periodo_id_periodo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cat_periodo_id_periodo_seq OWNER TO "AH1819";

--
-- TOC entry 3152 (class 0 OID 0)
-- Dependencies: 209
-- Name: cat_periodo_id_periodo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.cat_periodo_id_periodo_seq OWNED BY public.cat_periodo.id_periodo;


--
-- TOC entry 210 (class 1259 OID 74176)
-- Name: cliente; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.cliente (
    folio_cte integer NOT NULL,
    nombre character varying,
    apellido_p character varying,
    apellido_m character varying,
    fecha_nac date,
    telefono character varying(10),
    celular character varying(10),
    municipio character varying,
    residencia character varying,
    nombre_calle character varying,
    calle_referencia character varying,
    numero_mzn integer,
    numero_lt integer,
    rfc character varying(13),
    curp character varying(18),
    email text,
    status character varying
);


ALTER TABLE public.cliente OWNER TO "AH1819";

--
-- TOC entry 211 (class 1259 OID 74182)
-- Name: cliente_folio_cte_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.cliente_folio_cte_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_folio_cte_seq OWNER TO "AH1819";

--
-- TOC entry 3155 (class 0 OID 0)
-- Dependencies: 211
-- Name: cliente_folio_cte_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.cliente_folio_cte_seq OWNED BY public.cliente.folio_cte;


--
-- TOC entry 212 (class 1259 OID 74184)
-- Name: contrato; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.contrato (
    folio_contrato integer NOT NULL,
    municipio character varying,
    residencia character varying,
    nombre_calle character varying,
    calle_referencia character varying,
    observaciones text,
    numero_mzn integer,
    numero_lt integer,
    deuda double precision DEFAULT 0,
    consec integer,
    id_consumo integer,
    id_periodo integer,
    folio_cte integer,
    status character varying,
    fecha_creacion timestamp with time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE public.contrato OWNER TO "AH1819";

--
-- TOC entry 213 (class 1259 OID 74191)
-- Name: contrato_folio_contrato_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.contrato_folio_contrato_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contrato_folio_contrato_seq OWNER TO "AH1819";

--
-- TOC entry 3158 (class 0 OID 0)
-- Dependencies: 213
-- Name: contrato_folio_contrato_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.contrato_folio_contrato_seq OWNED BY public.contrato.folio_contrato;


--
-- TOC entry 214 (class 1259 OID 74193)
-- Name: det_abono; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.det_abono (
    consec integer NOT NULL,
    fecha_hora timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    abono double precision,
    saldo double precision,
    id_lect_pago integer NOT NULL,
    id_tipo_pago integer,
    id_desc integer,
    ticket_ventanilla character varying,
    pagado double precision
);


ALTER TABLE public.det_abono OWNER TO "AH1819";

--
-- TOC entry 215 (class 1259 OID 74200)
-- Name: det_abono_consec_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.det_abono_consec_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.det_abono_consec_seq OWNER TO "AH1819";

--
-- TOC entry 3161 (class 0 OID 0)
-- Dependencies: 215
-- Name: det_abono_consec_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.det_abono_consec_seq OWNED BY public.det_abono.consec;


--
-- TOC entry 216 (class 1259 OID 74202)
-- Name: det_cliente; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.det_cliente (
    consec integer NOT NULL,
    folio_cte integer NOT NULL,
    nombre character varying,
    apellido_p character varying,
    apellido_m character varying,
    fecha_nac date,
    curp character varying(18),
    telefono character varying(10),
    celular character varying(10),
    municipio character varying,
    residencia character varying,
    nombre_calle character varying,
    avn_calle character varying,
    calle_referencia character varying,
    numero_mzn integer,
    numero_lt integer,
    email text,
    rfc character varying(13),
    fecha_modificacion timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE public.det_cliente OWNER TO "AH1819";

--
-- TOC entry 217 (class 1259 OID 74209)
-- Name: det_cliente_consec_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.det_cliente_consec_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.det_cliente_consec_seq OWNER TO "AH1819";

--
-- TOC entry 3164 (class 0 OID 0)
-- Dependencies: 217
-- Name: det_cliente_consec_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.det_cliente_consec_seq OWNED BY public.det_cliente.consec;


--
-- TOC entry 218 (class 1259 OID 74211)
-- Name: det_tipoconsumo_tarifa; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.det_tipoconsumo_tarifa (
    consec integer NOT NULL,
    id_consumo integer NOT NULL,
    tarifa double precision
);


ALTER TABLE public.det_tipoconsumo_tarifa OWNER TO "AH1819";

--
-- TOC entry 223 (class 1259 OID 91113)
-- Name: empresa; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empresa (
    razon_social character varying,
    eslogan_mov character varying,
    pie character varying,
    terminos character varying,
    rfc character varying(13),
    municipio character varying,
    estado character varying,
    rutaterminos character varying DEFAULT 'xxx'::character varying
);


ALTER TABLE public.empresa OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 74214)
-- Name: lectura_pago; Type: TABLE; Schema: public; Owner: AH1819
--

CREATE TABLE public.lectura_pago (
    id_lect_pago integer NOT NULL,
    fecha_hora timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    lectura_ini double precision DEFAULT 0.0,
    lectura_fin double precision DEFAULT 0.0,
    consumo double precision DEFAULT 0.0,
    importe double precision,
    pagado double precision,
    adeudo double precision,
    folio_contrato integer,
    id_m integer,
    status character varying DEFAULT 'En Proceso'::character varying,
    costo_fijo boolean DEFAULT false,
    CONSTRAINT lectura_pago_adeudo_check CHECK ((adeudo > ('-1'::integer)::double precision))
);


ALTER TABLE public.lectura_pago OWNER TO "AH1819";

--
-- TOC entry 220 (class 1259 OID 74223)
-- Name: lectura_pago_id_lect_pago_seq; Type: SEQUENCE; Schema: public; Owner: AH1819
--

CREATE SEQUENCE public.lectura_pago_id_lect_pago_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.lectura_pago_id_lect_pago_seq OWNER TO "AH1819";

--
-- TOC entry 3168 (class 0 OID 0)
-- Dependencies: 220
-- Name: lectura_pago_id_lect_pago_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: AH1819
--

ALTER SEQUENCE public.lectura_pago_id_lect_pago_seq OWNED BY public.lectura_pago.id_lect_pago;


--
-- TOC entry 222 (class 1259 OID 74361)
-- Name: ticket; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ticket (
    id_ticket integer NOT NULL,
    consec integer NOT NULL,
    id_lect_pago integer NOT NULL
);


ALTER TABLE public.ticket OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 74359)
-- Name: ticket_id_ticket_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.ticket_id_ticket_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ticket_id_ticket_seq OWNER TO postgres;

--
-- TOC entry 3170 (class 0 OID 0)
-- Dependencies: 221
-- Name: ticket_id_ticket_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.ticket_id_ticket_seq OWNED BY public.ticket.id_ticket;


--
-- TOC entry 2932 (class 2604 OID 74230)
-- Name: cat_consumo id_consumo; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_consumo ALTER COLUMN id_consumo SET DEFAULT nextval('public.cat_consumo_id_consumo_seq'::regclass);


--
-- TOC entry 2933 (class 2604 OID 74231)
-- Name: cat_descuento id_desc; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_descuento ALTER COLUMN id_desc SET DEFAULT nextval('public.cat_descuento_id_desc_seq'::regclass);


--
-- TOC entry 2935 (class 2604 OID 74232)
-- Name: cat_mes id_m; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_mes ALTER COLUMN id_m SET DEFAULT nextval('public.cat_mes_id_m_seq'::regclass);


--
-- TOC entry 2936 (class 2604 OID 74233)
-- Name: cat_pago id_tipo_pago; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_pago ALTER COLUMN id_tipo_pago SET DEFAULT nextval('public.cat_pago_id_tipo_pago_seq'::regclass);


--
-- TOC entry 2937 (class 2604 OID 74234)
-- Name: cat_periodo id_periodo; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_periodo ALTER COLUMN id_periodo SET DEFAULT nextval('public.cat_periodo_id_periodo_seq'::regclass);


--
-- TOC entry 2938 (class 2604 OID 74235)
-- Name: cliente folio_cte; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cliente ALTER COLUMN folio_cte SET DEFAULT nextval('public.cliente_folio_cte_seq'::regclass);


--
-- TOC entry 2939 (class 2604 OID 74236)
-- Name: contrato folio_contrato; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.contrato ALTER COLUMN folio_contrato SET DEFAULT nextval('public.contrato_folio_contrato_seq'::regclass);


--
-- TOC entry 2942 (class 2604 OID 74237)
-- Name: det_abono consec; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_abono ALTER COLUMN consec SET DEFAULT nextval('public.det_abono_consec_seq'::regclass);


--
-- TOC entry 2944 (class 2604 OID 74238)
-- Name: det_cliente consec; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_cliente ALTER COLUMN consec SET DEFAULT nextval('public.det_cliente_consec_seq'::regclass);


--
-- TOC entry 2946 (class 2604 OID 74239)
-- Name: lectura_pago id_lect_pago; Type: DEFAULT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.lectura_pago ALTER COLUMN id_lect_pago SET DEFAULT nextval('public.lectura_pago_id_lect_pago_seq'::regclass);


--
-- TOC entry 2953 (class 2604 OID 74364)
-- Name: ticket id_ticket; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ticket ALTER COLUMN id_ticket SET DEFAULT nextval('public.ticket_id_ticket_seq'::regclass);


--
-- TOC entry 2957 (class 2606 OID 74242)
-- Name: cat_consumo cat_consumo_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_consumo
    ADD CONSTRAINT cat_consumo_pkey PRIMARY KEY (id_consumo);


--
-- TOC entry 2959 (class 2606 OID 74244)
-- Name: cat_descuento cat_descuento_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_descuento
    ADD CONSTRAINT cat_descuento_pkey PRIMARY KEY (id_desc);


--
-- TOC entry 2961 (class 2606 OID 74246)
-- Name: cat_mes cat_mes_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_mes
    ADD CONSTRAINT cat_mes_pkey PRIMARY KEY (id_m);


--
-- TOC entry 2963 (class 2606 OID 74248)
-- Name: cat_pago cat_pago_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_pago
    ADD CONSTRAINT cat_pago_pkey PRIMARY KEY (id_tipo_pago);


--
-- TOC entry 2965 (class 2606 OID 74250)
-- Name: cat_periodo cat_periodo_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cat_periodo
    ADD CONSTRAINT cat_periodo_pkey PRIMARY KEY (id_periodo);


--
-- TOC entry 2967 (class 2606 OID 74252)
-- Name: cliente cliente_celular_key; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_celular_key UNIQUE (celular);


--
-- TOC entry 2969 (class 2606 OID 74254)
-- Name: cliente cliente_curp_key; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_curp_key UNIQUE (curp);


--
-- TOC entry 2971 (class 2606 OID 74256)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (folio_cte);


--
-- TOC entry 2973 (class 2606 OID 74258)
-- Name: contrato contrato_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.contrato
    ADD CONSTRAINT contrato_pkey PRIMARY KEY (folio_contrato);


--
-- TOC entry 2975 (class 2606 OID 74260)
-- Name: det_abono det_abono_consec_key; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_abono
    ADD CONSTRAINT det_abono_consec_key UNIQUE (consec);


--
-- TOC entry 2977 (class 2606 OID 74262)
-- Name: det_abono det_abono_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_abono
    ADD CONSTRAINT det_abono_pkey PRIMARY KEY (consec, id_lect_pago);


--
-- TOC entry 2979 (class 2606 OID 74264)
-- Name: det_cliente det_cliente_celular_key; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_cliente
    ADD CONSTRAINT det_cliente_celular_key UNIQUE (celular);


--
-- TOC entry 2981 (class 2606 OID 74266)
-- Name: det_cliente det_cliente_curp_key; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_cliente
    ADD CONSTRAINT det_cliente_curp_key UNIQUE (curp);


--
-- TOC entry 2983 (class 2606 OID 74268)
-- Name: det_cliente det_cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_cliente
    ADD CONSTRAINT det_cliente_pkey PRIMARY KEY (consec, folio_cte);


--
-- TOC entry 2985 (class 2606 OID 74270)
-- Name: det_tipoconsumo_tarifa det_tipoconsumo_tarifa_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_tipoconsumo_tarifa
    ADD CONSTRAINT det_tipoconsumo_tarifa_pkey PRIMARY KEY (consec, id_consumo);


--
-- TOC entry 2987 (class 2606 OID 74272)
-- Name: lectura_pago lectura_pago_pkey; Type: CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.lectura_pago
    ADD CONSTRAINT lectura_pago_pkey PRIMARY KEY (id_lect_pago);


--
-- TOC entry 2989 (class 2606 OID 74366)
-- Name: ticket ticket_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT ticket_pkey PRIMARY KEY (consec, id_ticket, id_lect_pago);


--
-- TOC entry 3001 (class 2620 OID 74275)
-- Name: det_abono fn_abono; Type: TRIGGER; Schema: public; Owner: AH1819
--

CREATE TRIGGER fn_abono BEFORE INSERT OR UPDATE ON public.det_abono FOR EACH ROW EXECUTE FUNCTION public.fn_abono();


--
-- TOC entry 3002 (class 2620 OID 74276)
-- Name: lectura_pago importe; Type: TRIGGER; Schema: public; Owner: AH1819
--

CREATE TRIGGER importe BEFORE INSERT OR UPDATE ON public.lectura_pago FOR EACH ROW EXECUTE FUNCTION public.fimporte();


--
-- TOC entry 2990 (class 2606 OID 74277)
-- Name: contrato contrato_consec_id_consumo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.contrato
    ADD CONSTRAINT contrato_consec_id_consumo_fkey FOREIGN KEY (consec, id_consumo) REFERENCES public.det_tipoconsumo_tarifa(consec, id_consumo);


--
-- TOC entry 2991 (class 2606 OID 74282)
-- Name: contrato contrato_folio_cte_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.contrato
    ADD CONSTRAINT contrato_folio_cte_fkey FOREIGN KEY (folio_cte) REFERENCES public.cliente(folio_cte);


--
-- TOC entry 2992 (class 2606 OID 74287)
-- Name: contrato contrato_id_periodo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.contrato
    ADD CONSTRAINT contrato_id_periodo_fkey FOREIGN KEY (id_periodo) REFERENCES public.cat_periodo(id_periodo);


--
-- TOC entry 2993 (class 2606 OID 74292)
-- Name: det_abono det_abono_id_lect_pago_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_abono
    ADD CONSTRAINT det_abono_id_lect_pago_fkey FOREIGN KEY (id_lect_pago) REFERENCES public.lectura_pago(id_lect_pago);


--
-- TOC entry 2994 (class 2606 OID 74297)
-- Name: det_abono det_abono_id_tipo_pago_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_abono
    ADD CONSTRAINT det_abono_id_tipo_pago_fkey FOREIGN KEY (id_tipo_pago) REFERENCES public.cat_pago(id_tipo_pago);


--
-- TOC entry 2995 (class 2606 OID 74302)
-- Name: det_cliente det_cliente_folio_cte_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_cliente
    ADD CONSTRAINT det_cliente_folio_cte_fkey FOREIGN KEY (folio_cte) REFERENCES public.cliente(folio_cte);


--
-- TOC entry 2996 (class 2606 OID 74307)
-- Name: det_tipoconsumo_tarifa det_tipoconsumo_tarifa_id_consumo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.det_tipoconsumo_tarifa
    ADD CONSTRAINT det_tipoconsumo_tarifa_id_consumo_fkey FOREIGN KEY (id_consumo) REFERENCES public.cat_consumo(id_consumo);


--
-- TOC entry 2997 (class 2606 OID 74312)
-- Name: lectura_pago lectura_pago_folio_contrato_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.lectura_pago
    ADD CONSTRAINT lectura_pago_folio_contrato_fkey FOREIGN KEY (folio_contrato) REFERENCES public.contrato(folio_contrato);


--
-- TOC entry 2998 (class 2606 OID 74317)
-- Name: lectura_pago lectura_pago_id_m_fkey; Type: FK CONSTRAINT; Schema: public; Owner: AH1819
--

ALTER TABLE ONLY public.lectura_pago
    ADD CONSTRAINT lectura_pago_id_m_fkey FOREIGN KEY (id_m) REFERENCES public.cat_mes(id_m);


--
-- TOC entry 2999 (class 2606 OID 74372)
-- Name: ticket ticket_consec_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT ticket_consec_fkey FOREIGN KEY (consec) REFERENCES public.det_abono(consec);


--
-- TOC entry 3000 (class 2606 OID 74367)
-- Name: ticket ticket_id_lect_pago_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT ticket_id_lect_pago_fkey FOREIGN KEY (id_lect_pago) REFERENCES public.lectura_pago(id_lect_pago);


--
-- TOC entry 3138 (class 0 OID 0)
-- Dependencies: 5
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: AH1819
--

REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- TOC entry 3139 (class 0 OID 0)
-- Dependencies: 200
-- Name: TABLE cat_consumo; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.cat_consumo TO administrador;


--
-- TOC entry 3141 (class 0 OID 0)
-- Dependencies: 201
-- Name: SEQUENCE cat_consumo_id_consumo_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.cat_consumo_id_consumo_seq TO administrador;


--
-- TOC entry 3142 (class 0 OID 0)
-- Dependencies: 202
-- Name: TABLE cat_descuento; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.cat_descuento TO administrador;


--
-- TOC entry 3144 (class 0 OID 0)
-- Dependencies: 203
-- Name: SEQUENCE cat_descuento_id_desc_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.cat_descuento_id_desc_seq TO administrador;


--
-- TOC entry 3145 (class 0 OID 0)
-- Dependencies: 204
-- Name: TABLE cat_mes; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.cat_mes TO administrador WITH GRANT OPTION;


--
-- TOC entry 3147 (class 0 OID 0)
-- Dependencies: 205
-- Name: SEQUENCE cat_mes_id_m_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.cat_mes_id_m_seq TO administrador;


--
-- TOC entry 3148 (class 0 OID 0)
-- Dependencies: 206
-- Name: TABLE cat_pago; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.cat_pago TO administrador;


--
-- TOC entry 3150 (class 0 OID 0)
-- Dependencies: 207
-- Name: SEQUENCE cat_pago_id_tipo_pago_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.cat_pago_id_tipo_pago_seq TO administrador;


--
-- TOC entry 3151 (class 0 OID 0)
-- Dependencies: 208
-- Name: TABLE cat_periodo; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.cat_periodo TO administrador;


--
-- TOC entry 3153 (class 0 OID 0)
-- Dependencies: 209
-- Name: SEQUENCE cat_periodo_id_periodo_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.cat_periodo_id_periodo_seq TO administrador;


--
-- TOC entry 3154 (class 0 OID 0)
-- Dependencies: 210
-- Name: TABLE cliente; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.cliente TO administrador;


--
-- TOC entry 3156 (class 0 OID 0)
-- Dependencies: 211
-- Name: SEQUENCE cliente_folio_cte_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.cliente_folio_cte_seq TO administrador;


--
-- TOC entry 3157 (class 0 OID 0)
-- Dependencies: 212
-- Name: TABLE contrato; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.contrato TO administrador;


--
-- TOC entry 3159 (class 0 OID 0)
-- Dependencies: 213
-- Name: SEQUENCE contrato_folio_contrato_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.contrato_folio_contrato_seq TO administrador;


--
-- TOC entry 3160 (class 0 OID 0)
-- Dependencies: 214
-- Name: TABLE det_abono; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.det_abono TO administrador;


--
-- TOC entry 3162 (class 0 OID 0)
-- Dependencies: 215
-- Name: SEQUENCE det_abono_consec_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.det_abono_consec_seq TO administrador;


--
-- TOC entry 3163 (class 0 OID 0)
-- Dependencies: 216
-- Name: TABLE det_cliente; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.det_cliente TO administrador;


--
-- TOC entry 3165 (class 0 OID 0)
-- Dependencies: 217
-- Name: SEQUENCE det_cliente_consec_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.det_cliente_consec_seq TO administrador;


--
-- TOC entry 3166 (class 0 OID 0)
-- Dependencies: 218
-- Name: TABLE det_tipoconsumo_tarifa; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.det_tipoconsumo_tarifa TO administrador;


--
-- TOC entry 3167 (class 0 OID 0)
-- Dependencies: 219
-- Name: TABLE lectura_pago; Type: ACL; Schema: public; Owner: AH1819
--

GRANT ALL ON TABLE public.lectura_pago TO administrador WITH GRANT OPTION;


--
-- TOC entry 3169 (class 0 OID 0)
-- Dependencies: 220
-- Name: SEQUENCE lectura_pago_id_lect_pago_seq; Type: ACL; Schema: public; Owner: AH1819
--

GRANT SELECT,USAGE ON SEQUENCE public.lectura_pago_id_lect_pago_seq TO administrador;


-- Completed on 2023-08-17 09:50:16

--
-- PostgreSQL database dump complete
--

