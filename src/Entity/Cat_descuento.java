
package Entity;

import java.sql.Date;

public class Cat_descuento {
    private Integer id_desc;
    private Date fecha_inc;
    private Date fecha_fin;
    private String descripcion;
    private Double porcentaje;

    public Integer getId_desc() {
        return id_desc;
    }

    public void setId_desc(Integer id_desc) {
        this.id_desc = id_desc;
    }

    public Date getFecha_inc() {
        return fecha_inc;
    }

    public void setFecha_inc(Date fecha_inc) {
        this.fecha_inc = fecha_inc;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Cat_descuento(Integer id_desc, Date fecha_inc, Date fecha_fin, String descripcion, Double porcentaje) {
        this.id_desc = id_desc;
        this.fecha_inc = fecha_inc;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
    }

    public Cat_descuento() {
    }
    
}
