package Entity;

import java.util.Date;

public class DetAbono {

    private Integer consec;
    private Date fechaHora;
    private Double abono;
    private Double saldo;
    private Integer id_lectura_pago;
    private Integer id_tipo_pago;
    private String folio_ventanilla;
    private int id_desc;
    private double pagado;

    public DetAbono(Double abono, Integer id_lectura_pago, Integer id_tipo_pago, Integer id_desc, String folio_ventanilla, double pagado) {
        this.abono = abono;
        this.id_lectura_pago = id_lectura_pago;
        this.id_tipo_pago = id_tipo_pago;
        this.id_desc = id_desc;
        this.folio_ventanilla = folio_ventanilla;
        this.pagado = pagado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getAbono() {
        return abono;
    }

    public void setAbono(Double abono) {
        this.abono = abono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getConsec() {
        return consec;
    }

    public void setConsec(Integer consec) {
        this.consec = consec;
    }

    public Integer getId_lectura_pago() {
        return id_lectura_pago;
    }

    public void setId_lectura_pago(Integer id_lectura_pago) {
        this.id_lectura_pago = id_lectura_pago;
    }

    public Integer getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(Integer id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getFolio_ventanilla() {
        return folio_ventanilla;
    }

    public void setFolio_ventanilla(String folio_ventanilla) {
        this.folio_ventanilla = folio_ventanilla;
    }

    public int getId_desc() {
        return id_desc;
    }

    public void setId_desc(int id_desc) {
        this.id_desc = id_desc;
    }

    public double getPagado() {
        return pagado;
    }

    public void setPagado(double pagado) {
        this.pagado = pagado;
    }

}
