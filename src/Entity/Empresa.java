package Entity;

/**
 *
 * @author Hitler
 */
public class Empresa {

    private static String razon_social;
    private static String eslogan_mov;
    private static String sa;
    private static String RFC;
    private static String estado;
    private static String municipio;
    private static String pie;
    private static String terminos_y_condiciones;

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getEslogan_mov() {
        return eslogan_mov;
    }

    public void setEslogan_mov(String eslogan_mov) {
        this.eslogan_mov = eslogan_mov;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String encabezado) {
        this.sa = encabezado;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public String getTerminos_y_condiciones() {
        return terminos_y_condiciones;
    }

    public void setTerminos_y_condiciones(String terminos_y_condiciones) {
        this.terminos_y_condiciones = terminos_y_condiciones;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
