package Controlador;

import Dao.EmpresaDao;
import Modelo.Empresa;

/**
 *
 * @author Hitler
 */
public class Empresa_Controller {
    
    EmpresaDao empD;
    
    public Empresa_Controller() {
        empD = new EmpresaDao();
    }
    
    public boolean LeerDatos() {
        return empD.EmpresaData();
    }
    
    public boolean ActualizarDatos(Empresa emp) {
        empD.setCt(emp);
        return empD.ActualizarDatos();
    }
    
}
