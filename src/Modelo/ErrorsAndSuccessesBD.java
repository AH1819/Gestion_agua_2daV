package Modelo;

public class ErrorsAndSuccessesBD {

    private static String cadenaerrorbd;//error en la conexion
    private static boolean Conexion;//Conexion exitosa
    private static boolean resultact;//actualizar exitoso
    private static int resultinsert;//Folio retornado insertar
    private static String ubicacion = "null"; //Ubicacion en ventanas

    public String getCadenaErrorBD() {
        return cadenaerrorbd;
    }

    public void setCadenaErrorBD(String errorconexion) {
        this.cadenaerrorbd = errorconexion;
    }

    public boolean isConexion() {
        return Conexion;
    }

    public void setConexion(boolean ExitoConexion) {
        this.Conexion = ExitoConexion;
    }

    public boolean getResultact() {
        return resultact;
    }

    public void setResultact(boolean resultact) {
        this.resultact = resultact;
    }

    public int getResultinsert() {
        return resultinsert;
    }

    public void setResultinsert(int resultinsert) {
        this.resultinsert = resultinsert;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
