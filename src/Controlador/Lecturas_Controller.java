package Controlador;

import Dao.LecturapagoDao;
import Modelo.LecturaPago;
import Modelo.CRUD;
import java.util.ArrayList;
import lombok.Setter;

/**
 *
 * @author Hitler
 */
public class Lecturas_Controller extends CRUD<LecturaPago> {

    @Setter
    LecturaPago lectura;
    LecturapagoDao LPD;

    public Lecturas_Controller() {
        LPD = new LecturapagoDao();
    }

    @Override
    public int Create() {
        return LPD.InsertarLecturapago(lectura);
    }
    public int CreatePagoFijo(Double lecturapago, int folio, int mes,boolean op){
        return LPD.InsertarLecturapagoFijo(lecturapago, folio, mes,op);
    }
    @Override
    public Iterable<LecturaPago> Read() {
        return LPD.MostrarLecturas();
    }

    @Override
    public LecturaPago ReadOne(int folio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int folio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LecturaPago Mes_adeudo(int folio) {
        return LPD.Mes_adeudo(folio);
    }

    public ArrayList<LecturaPago> Meses_adeudo(int id) {
        return LPD.Meses_adeudo(id);
    }
}
