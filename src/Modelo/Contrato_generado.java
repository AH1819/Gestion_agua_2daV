package Modelo;

import java.sql.Date;

public class Contrato_generado {

    private static Integer folio_contrato = null;
    private static Integer folio_cliente = null;
    private static String Nombre_cliente = null;
    private static String direccion = null;
    private static String manzana = null;
    private static String lote = null;
    private static String informativo = null;
    private static Date creacion_contrato;

    public Date getCreacion_contrato() {
        return creacion_contrato;
    }

    public void setCreacion_contrato(Date aCreacion_contrato) {
        creacion_contrato = aCreacion_contrato;
    }
    
    public String getInformativo() {
        return informativo;
    }

    public void setInformativo(String Informativo) {
        informativo = Informativo;
    }

    public Integer getFolio_contrato() {
        return folio_contrato;
    }

    public void setFolio_contrato(Integer folio_contrato) {
        this.folio_contrato = folio_contrato;
    }

    public Integer getFolio_cliente() {
        return folio_cliente;
    }

    public void setFolio_cliente(Integer folio_cliente) {
        this.folio_cliente = folio_cliente;
    }

    public Contrato_generado(Integer folio_cte, Integer folio_contrato) {
        this.folio_contrato = folio_contrato;
        this.folio_cliente = folio_cte;
    }

    public Contrato_generado() {
    }

    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

}
