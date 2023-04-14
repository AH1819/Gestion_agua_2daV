package Entity;

public class Clientes_existentes {

    private static String[] nombre_completo;
    private static String[] numero_contacto;
    private static String[] rfc;
    private static String[] curp;

    public Clientes_existentes() {
    }

    public Clientes_existentes(String[] nombre_completo, String[] numero_contacto, String[] rfc, String[] curp) {
        this.nombre_completo = nombre_completo;
        this.numero_contacto = numero_contacto;
        this.rfc = rfc;
        this.curp = curp;
    }

    public String[] getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String[] nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String[] getNumero_contacto() {
        return numero_contacto;
    }

    public void setNumero_contacto(String[] numero_contacto) {
        this.numero_contacto = numero_contacto;
    }

    public String[] getRfc() {
        return rfc;
    }

    public void setRfc(String[] rfc) {
        this.rfc = rfc;
    }

    public String[] getCurp() {
        return curp;
    }

    public void setCurp(String[] curp) {
        this.curp = curp;
    }

}
