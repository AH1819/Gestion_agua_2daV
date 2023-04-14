package Entity;

import java.sql.Date;

public class Cliente {

    private Integer folio_cliente;
    private Integer folio_contrato;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private Date fecha_nac;
    private String telefono;
    private String celular;
    private String email;
    private String curp;
    private String rfc;
    private String municipio;
    private String residencia;
    private String nombre_calle;
    private String calle_referencia;
    private int numero_manzana;
    private int numero_lote;
    private String status = "activo";
    private double deuda;
    private String consumo;

    public Integer getFolio_cliente() {
        return folio_cliente;
    }

    public void setFolio_cliente(Integer folio_cliente) {
        this.folio_cliente = folio_cliente;
    }

    public Integer getFolio_contrato() {
        return folio_contrato;
    }

    public void setFolio_contrato(Integer folio_contrato) {
        this.folio_contrato = folio_contrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public String getCalle_referencia() {
        return calle_referencia;
    }

    public void setCalle_referencia(String calle_referencia) {
        this.calle_referencia = calle_referencia;
    }

    public int getNumero_manzana() {
        return numero_manzana;
    }

    public void setNumero_manzana(int numero_manzana) {
        this.numero_manzana = numero_manzana;
    }

    public int getNumero_lote() {
        return numero_lote;
    }

    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Cliente() {
    }

    //folio_cte,nombre,app,apm.fecnac,tel,cel,email,curp,rfc,muni,resi,nombre_calle,referencia,manzana,lote
    public Cliente(Integer folio_cliente, String nombre, String apellido_p, String apellido_m, Date fecha_nac, String telefono, String celular, String email, String curp, String rfc, String municipio, String residencia, String nombre_calle, String calle_referencia, int numero_manzana, int numero_lote) {
        this.folio_cliente = folio_cliente;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.curp = curp;
        this.rfc = rfc;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombre_calle = nombre_calle;
        this.calle_referencia = calle_referencia;
        this.numero_manzana = numero_manzana;
        this.numero_lote = numero_lote;
    }

    //nombre,apellidop,apellidom,fechanac,telefono,Celular,email,curp,rfc,municipio,residencia,nombre_calle,referencia,manzana,lote,status
    public Cliente(String nombre, String apellido_p, String apellido_m, Date fecha_nac, String telefono, String celular, String email, String curp, String rfc, String municipio, String residencia, String nombre_calle, String calle_referencia, int numero_manzana, int numero_lote) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.curp = curp;
        this.rfc = rfc;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombre_calle = nombre_calle;
        this.calle_referencia = calle_referencia;
        this.numero_manzana = numero_manzana;
        this.numero_lote = numero_lote;
    }

    //folio_cte,municipio,residencia,nombre_calle,referencia,manzana,lote
    public Cliente(Integer folio_cliente, String municipio, String residencia, String nombre_calle, String calle_referencia, int numero_manzana, int numero_lote) {
        this.folio_cliente = folio_cliente;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombre_calle = nombre_calle;
        this.calle_referencia = calle_referencia;
        this.numero_manzana = numero_manzana;
        this.numero_lote = numero_lote;
    }

    //folio_cliente,nombre,domicilio
    public Cliente(Integer folio_cliente, String nombre, String residencia) {
        this.folio_cliente = folio_cliente;
        this.nombre = nombre;
        this.residencia = residencia;
    }

}
