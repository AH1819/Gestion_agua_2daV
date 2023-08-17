package Controlador;

import Dao.ClienteDao;
import Modelo.Cliente;
import Modelo.CRUD;
import java.util.ArrayList;
import lombok.Setter;

/**
 *
 * @author Hitler
 */
public class Cliente_Controller extends CRUD<Cliente> {

    ClienteDao CD;
    @Setter
    Cliente cl;
    @Setter
    int opcion;

    public Cliente_Controller() {
        CD = new ClienteDao();
    }

    @Override
    public int Create() {
        CD.setCliente(cl);
        return CD.InsertarCliente();
    }

    @Override
    public Iterable<Cliente> Read() {
        return CD.MostrarClientes(opcion);
    }
    
    public ArrayList<Cliente> pagocl_ct(int folio){
        return CD.Pagocl_contrato(folio);
    }
    
    public ArrayList<Cliente> pagocl_cte(int folio){
        return CD.Pagocl_cte(folio);
    }
    
    public ArrayList<Cliente> pagocl_num(String number){
        return CD.Pagocl_num(number);
    }
    
    public ArrayList<Cliente> pagocl_numT(String number){
        return CD.Pagocl_numT(number);
    }
    
    @Override
    public Cliente ReadOne(int folio) {
        return CD.SearchClientes(folio);
    }

    @Override
    public boolean Update() {
        CD.setCliente(cl);
        return CD.ActualizarCliente();
    }

    @Override
    public boolean Delete(int folio) {
        return CD.DarDeBajaCliente(folio);
    }

    public boolean Alta(int folio) {
        return CD.DarDeAltaCliente(folio);
    }
}
