package Entity;

public class Cat_pago {
    private Integer id_tipo_pago;
    private String tipo_pago;

    public Integer getId_pago() {
        return id_tipo_pago;
    }

    public void setId_pago(Integer id_pago) {
        this.id_tipo_pago = id_pago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Cat_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Cat_pago() {
    }
    
}
