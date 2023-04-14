package Entity;

import java.sql.Date;

public class Reportes {

    private Integer id;
    private String nombre;
    private String meses_adeudo;
    private Double cantidad;
    private Double total_deuda;
    private Date fecha_creacion;

    public Reportes() {
    }

    public Reportes(Integer id, String nombre, Date fecha_creacion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
    }
    
    public Reportes(Integer id_contrato,String nombre, String meses_adeudo, Double cantidad, Double total_deuda) {
        this.id = id_contrato;
        this.nombre = nombre;
        this.meses_adeudo = meses_adeudo;
        this.cantidad = cantidad;
        this.total_deuda = total_deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMeses_adeudo() {
        return meses_adeudo;
    }

    public void setMeses_adeudo(String meses_adeudo) {
        this.meses_adeudo = meses_adeudo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal_deuda() {
        return total_deuda;
    }

    public void setTotal_deuda(Double total_deuda) {
        this.total_deuda = total_deuda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
}
