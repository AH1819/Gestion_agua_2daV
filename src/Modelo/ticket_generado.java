package Modelo;

public class ticket_generado {

    private static Integer folio_ticket = null;
    private static Integer folio_contrato = null;
    private static String mes = null;
    private static String consumo = null;
    private static Double importe = null;
    private static String t_pago = null;
    private static Double porcentaje = null;
    private static Double pago = null;
    private static Double total = null;

    public Integer getFolio_ticket() {
        return folio_ticket;
    }

    public void setFolio_ticket(Integer folio_ticket) {
        this.folio_ticket = folio_ticket;
    }

    public Integer getFolio_contrato() {
        return folio_contrato;
    }

    public void setFolio_contrato(Integer folio_contrato) {
        this.folio_contrato = folio_contrato;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getT_pago() {
        return t_pago;
    }

    public void setT_pago(String t_pago) {
        this.t_pago = t_pago;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ticket_generado() {
    }

    //ticket,folio_contrato,mes_pago,tipo_consumo,cargo_generado,tipo_pago,descuento,monto_pago,total
    public ticket_generado(int folio_ticket,int folio_contrato, String mes_pago, String consumo, double importe, String tipo_pago, Double descuento, Double monto_pago, Double total) {
        this.folio_ticket = folio_ticket;
        this.folio_contrato = folio_contrato;
        this.mes = mes_pago;
        this.consumo = consumo;
        this.importe = importe;
        this.t_pago = tipo_pago;
        this.porcentaje = descuento;
        this.pago = monto_pago;
        this.total = total;
    }
}
