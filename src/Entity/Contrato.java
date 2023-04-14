package Entity;

import java.sql.Date;

public class Contrato {

    private Integer folioContrato;
    private String municipio;
    private String residencia;
    private String nombreCalle;
    private String calleReferencia;
    private String observaciones;
    private Integer numeroMzn;
    private Integer numeroLt;
    private Integer consec;
    private Integer id_consumo;
    private Integer id_periodo;
    private Double deuda;
    private Integer folio_cte;
    private String status;
    private String tipo_consumo;
    private String tipo_periodo;
    private String nombre;
    private Date creacion_contrato;
    
    public Integer getFolioContrato() {
        return folioContrato;
    }

    public void setFolioContrato(Integer folioContrato) {
        this.folioContrato = folioContrato;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getCalleReferencia() {
        return calleReferencia;
    }

    public void setCalleReferencia(String calleReferencia) {
        this.calleReferencia = calleReferencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNumeroMzn() {
        return numeroMzn;
    }

    public void setNumeroMzn(Integer numeroMzn) {
        this.numeroMzn = numeroMzn;
    }

    public Integer getNumeroLt() {
        return numeroLt;
    }

    public void setNumeroLt(Integer numeroLt) {
        this.numeroLt = numeroLt;
    }

    public Integer getConsec() {
        return consec;
    }

    public void setConsec(Integer consec) {
        this.consec = consec;
    }

    public Integer getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(Integer id_consumo) {
        this.id_consumo = id_consumo;
    }

    public Integer getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Integer id_periodo) {
        this.id_periodo = id_periodo;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    public Integer getFolio_cte() {
        return folio_cte;
    }

    public void setFolio_cte(Integer folio_cte) {
        this.folio_cte = folio_cte;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo_consumo() {
        return tipo_consumo;
    }

    public void setTipo_consumo(String tipo_consumo) {
        this.tipo_consumo = tipo_consumo;
    }

    public String getTipo_periodo() {
        return tipo_periodo;
    }

    public void setTipo_periodo(String tipo_periodo) {
        this.tipo_periodo = tipo_periodo;
    }
    
    public Contrato() {
    }
    
    
    
    public Contrato(Integer folioContrato,String nombre, String municipio, String residencia, String nombreCalle, String calleReferencia, String observaciones, Integer numeroMzn, Integer numeroLt, Integer consec, Integer id_consumo, Integer id_periodo, Double deuda, Integer folio_cte, String status, String tipo_consumo, String tipo_periodo) {
        this.folioContrato = folioContrato;
        this.nombre = nombre;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.observaciones = observaciones;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
        this.consec = consec;
        this.id_consumo = id_consumo;
        this.id_periodo = id_periodo;
        this.deuda = deuda;
        this.folio_cte = folio_cte;
        this.status = status;
        this.tipo_consumo = tipo_consumo;
        this.tipo_periodo = tipo_periodo;
    }
//
    public Contrato(String municipio, String residencia, String nombreCalle, String calleReferencia, String observaciones, Integer numeroMzn, Integer numeroLt, Integer consec, Integer id_consumo, Integer id_periodo, Integer folio_cte, String status) {
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.observaciones = observaciones;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
        this.consec = consec;
        this.id_consumo = id_consumo;
        this.id_periodo = id_periodo;
        this.folio_cte = folio_cte;
        this.status = status;
    }

    public Contrato(Integer folioContrato, String municipio, String residencia, String nombreCalle, String calleReferencia, String observaciones, Integer numeroMzn, Integer numeroLt) {
        this.folioContrato = folioContrato;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.observaciones = observaciones;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreacion_contrato() {
        return creacion_contrato;
    }

    public void setCreacion_contrato(Date creacion_contrato) {
        this.creacion_contrato = creacion_contrato;
    }
}
