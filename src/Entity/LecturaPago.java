package Entity;

import java.sql.Date;

public class LecturaPago {

    private Integer idLectPago;
    private Date fechaHora;
    private Double lecturaIni;
    private Double lecturaFin;
    private Double consumo;
    private Double importe;
    private Double pagado;
    private Double adeudo;
    private String status;
    private Integer folio_contrato;
    private Integer folio_cliente;
    private String nombre_cliente;
    private Integer id_m;
    private String mes;
    private String tipo_periodo;
    private String Tiempo_transcurrido;
    
    public LecturaPago() {
    }

    public LecturaPago(Double lecturaIni, Double lecturaFin, Double consumo, Integer folio_contrato,Integer id_m) {
        this.lecturaIni = lecturaIni;
        this.lecturaFin = lecturaFin;
        this.consumo = consumo;
        this.folio_contrato = folio_contrato;
        this.id_m = id_m;
    }
    
    
    
    public LecturaPago(Integer idLectPago) {
        this.idLectPago = idLectPago;
    }

    public Integer getIdLectPago() {
        return idLectPago;
    }

    public void setIdLectPago(Integer idLectPago) {
        this.idLectPago = idLectPago;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getLecturaIni() {
        return lecturaIni;
    }

    public void setLecturaIni(Double lecturaIni) {
        this.lecturaIni = lecturaIni;
    }

    public Double getLecturaFin() {
        return lecturaFin;
    }

    public void setLecturaFin(Double lecturaFin) {
        this.lecturaFin = lecturaFin;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }

    public Double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(Double adeudo) {
        this.adeudo = adeudo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFolio_contrato() {
        return folio_contrato;
    }

    public void setFolio_contrato(Integer folio_contrato) {
        this.folio_contrato = folio_contrato;
    }

    public Integer getId_m() {
        return id_m;
    }

    public void setId_m(Integer id_m) {
        this.id_m = id_m;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTiempo_transcurrido() {
        return Tiempo_transcurrido;
    }

    public void setTiempo_transcurrido(String Tiempo_transcurrido) {
        this.Tiempo_transcurrido = Tiempo_transcurrido;
    }

    public Integer getFolio_cliente() {
        return folio_cliente;
    }

    public void setFolio_cliente(Integer folio_cliente) {
        this.folio_cliente = folio_cliente;
    }

    public String getTipo_periodo() {
        return tipo_periodo;
    }

    public void setTipo_periodo(String tipo_periodo) {
        this.tipo_periodo = tipo_periodo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
}
