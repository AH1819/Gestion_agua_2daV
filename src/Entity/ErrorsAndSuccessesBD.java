package Entity;

public class ErrorsAndSuccessesBD {

    private static String errorconexion;//error en la conexion
    private static boolean ExitoConexion;//Conexion exitosa
    private static int resultact;//Folio retornado actualizar
    private static int resultinsert;//Folio retornado insertar
    private static String ubicacion = "null"; //Ubicacion en ventanas
    public String getErrorconexion() {
        return errorconexion;
    }

    public void setErrorconexion(String errorconexion) {
        this.errorconexion = errorconexion;
    }

    public boolean isExitoConexion() {
        return ExitoConexion;
    }

    public void setExitoConexion(boolean ExitoConexion) {
        this.ExitoConexion = ExitoConexion;
    }

    public int getResultact() {
        return resultact;
    }

    public void setResultact(int resultact) {
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
