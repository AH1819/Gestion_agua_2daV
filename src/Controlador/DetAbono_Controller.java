package Controlador;

import Dao.Det_abonoDao;
import Modelo.DetAbono;
import java.util.ArrayList;
import lombok.Setter;

/**
 *
 * @author Hitler
 */
public class DetAbono_Controller {

    @Setter
    DetAbono abono;
    Det_abonoDao dadao;

    public DetAbono_Controller() {
        dadao = new Det_abonoDao();
    }

    public int Create() {
        return dadao.InsertarDetAbono(abono);
    }

    public ArrayList<DetAbono> Read(int folio) {
        return dadao.GetAbonos(folio);
    }
}
