package Controlador;

import Dao.CatalogosDao;
import Dao.ReportesDao;
import Modelo.Cat_descuento;
import Modelo.CRUD;
import Modelo.Cat_Consumo;
import Modelo.Cat_pago;
import Modelo.Cat_periodo;
import Modelo.DetTipoconsumoTarifa;
import Modelo.Reportes;
import lombok.Setter;

/**
 *
 * @author Hitler
 * @param <T>
 */
public class Catalogo_Controller<T> extends CRUD {

    CatalogosDao CD;
    ReportesDao RD;

    @Setter
    Cat_descuento descuento;//1
    @Setter
    Cat_Consumo consumo;//2
    @Setter
    Cat_periodo periodo;//3
    @Setter
    Cat_pago pago;//4
    @Setter
    DetTipoconsumoTarifa tarifa;//5
    @Setter
    Reportes reporte;//6
    @Setter
    String opcionS;
    @Setter
    int opcion;
    @Setter
    int opcion_reportes;
    @Setter
    int opcion_reportes_opcion;

    public Catalogo_Controller() {
        CD = new CatalogosDao();
        RD = new ReportesDao();
    }

    @Override
    public int Create() {
        switch (opcion) {
            case 1:
                return CD.InsertarDescuento(descuento);
            case 2:
                return CD.Insertar_Consumo(consumo.getTipo_consumo());
            case 3:
                return CD.Insertar_Periodo(periodo.getTipo_periodo(), periodo.getMeses());
            case 4:
                return CD.InsertarPago(pago.getTipo_pago());
            case 5:
                return CD.Insertar_Tarifa(tarifa.getConsec(), tarifa.getId_consumo(), tarifa.getTarifa());
        }
        return 0;
    }

    @Override
    public Iterable Read() {
        switch (opcion) {
            case 1:
                return CD.ObtenerDescuentos(opcionS);
            case 2:
                return CD.GetConsumo();
            case 3:
                return CD.GetPeriodo();
            case 4:
                return CD.Tipo_pago();
            case 5:
                return CD.Mostrar_Tarifas();
            case 6:
                switch (opcion_reportes) {
                    case 1:
                        return RD.Reporte_adeudos();
                    case 2:
                        return RD.Contratoxaño(opcion_reportes_opcion);
                    case 3:
                        return RD.Contratoxmes(opcion_reportes_opcion);
                }
                break;
        }
        return null;
    }

    @Override
    public T ReadOne(int folio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update() {
        switch (opcion) {
            case 1:
                return CD.ActualizarDescuento(descuento);
            case 2:
                return CD.Actualizar_Consumo(consumo.getId_consumo(), consumo.getTipo_consumo());
            case 3:
                return CD.Actualizar_Periodo(periodo.getId_periodo(), periodo.getTipo_periodo(), periodo.getMeses());
            case 4:
                return CD.Actualizar_Tarifa(tarifa.getConsec(), tarifa.getId_consumo(), tarifa.getConsumo_act(), tarifa.getTarifa());
            case 5:
                return CD.ActualizarTipo_Pago(pago.getId_tipo_pago(), pago.getTipo_pago());
        }
        return false;
    }

    @Override
    public boolean Delete(int folio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
