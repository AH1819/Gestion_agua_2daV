package Conexion;

import java.io.Serializable;

public class PersistenciaLoginBD implements Serializable {
    private String host;
    private String base;
    private String puerto;

    public PersistenciaLoginBD() {
    }

    public PersistenciaLoginBD(String host, String base, String puerto) {
        this.host = host;
        this.base = base;
        this.puerto = puerto;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
