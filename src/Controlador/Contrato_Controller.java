package Controlador;

import Dao.ContratoDao;
import Modelo.CRUD;
import Modelo.Contrato;
import lombok.Setter;

/**
 *
 * @author Hitler
 */
public class Contrato_Controller extends CRUD<Contrato> {

    ContratoDao CD;
    @Setter
    Contrato ct;
    @Setter
    int opcion;

    public Contrato_Controller() {
        CD = new ContratoDao();
    }

    @Override
    public int Create() {
        CD.setContrato(ct);
        return CD.InsertarContrato();
    }

    @Override
    public Iterable<Contrato> Read() {
        return CD.MostrarContratos(opcion);
    }

    @Override
    public Contrato ReadOne(int folio) {
        return CD.SearchContratos_c(folio);
    }

    @Override
    public boolean Update() {
        CD.setContrato(ct);
        System.out.println(ct.toString());
        return CD.ActualizarContrato();
    }

    @Override
    public boolean Delete(int folio) {
        return CD.DarDeBajaContrato(folio);
    }

    public boolean Alta(int folio) {
        return CD.DarDeAltaContrato(folio);
    }

    public Contrato GenerarContrato(int folio) {
        return CD.GenerarContrato(folio);
    }

    public Contrato BuscarContrato(int folio) {
        return CD.SearchContratos_c(folio);
    }
}
