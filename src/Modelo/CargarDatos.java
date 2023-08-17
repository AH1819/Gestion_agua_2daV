package Modelo;

import Controlador.Catalogo_Controller;
import Controlador.Cliente_Controller;
import Controlador.Contrato_Controller;
import Controlador.Empresa_Controller;
import Controlador.Lecturas_Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class CargarDatos {

    Cliente_Controller CC = new Cliente_Controller();
    Contrato_Controller CT = new Contrato_Controller();
    Lecturas_Controller LC = new Lecturas_Controller();
    Catalogo_Controller CTC = new Catalogo_Controller();
    Empresa_Controller ED = new Empresa_Controller();
    Datos_Existentes DE = new Datos_Existentes();

    public void CargarTodo() {
        CargarContratos(0);
        CargarClientes(0);
        CargarEmpresa();
    }

    public void CargarEmpresa() {
        if (!ED.LeerDatos()) {
            JOptionPane.showMessageDialog(
                    null,
                    "No hay registros para mostrar",
                    "Lecturas",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public boolean CargarClientes(int opcion) {
        boolean status = false;
        CC.setOpcion(opcion);
        DE.setClientes_Guardados((ArrayList<Cliente>) CC.Read());
        if (!DE.getClientes_Guardados().isEmpty()) {
            status = true;
        }
        return status;
    }

    public boolean CargarContratos(int opcion) {
        boolean status = true;
        CT.setOpcion(opcion);
        DE.setContratos_Guardados((ArrayList<Contrato>) CT.Read());
        if (DE.getContratos_Guardados().isEmpty()) {
            status = false;
        }
        return status;
    }

    public void CargarLecturas(boolean opcion) {
        DE.setLecturas_Guardadas((ArrayList<LecturaPago>) LC.Read());
        if (DE.getLecturas_Guardadas().isEmpty()) {
            if (opcion) {
                JOptionPane.showMessageDialog(
                        null,
                        "No hay registros para mostrar",
                        "Lecturas",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void CargarConsumo(boolean opcion) {
        CTC.setOpcion(2);
        DE.setConsumos_Guardados((ArrayList<Cat_Consumo>) CTC.Read());
        if (DE.getConsumos_Guardados().get(0).getId_consumo() != null) {
            if (opcion) {
                JOptionPane.showMessageDialog(
                        null,
                        "No hay registros para mostrar",
                        "Consumos",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void CargarPeriodo(boolean opcion) {
        CTC.setOpcion(3);
        DE.setPeriodos_Guardados((ArrayList<Cat_periodo>) CTC.Read());
        if (DE.getPeriodos_Guardados().isEmpty()) {
            if (opcion) {
                JOptionPane.showMessageDialog(
                        null,
                        "No hay registros para mostrar",
                        "Periodos",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void CargarTarifa(boolean opcion) {
        CTC.setOpcion(5);
        DE.setTarifas_Guardadas((ArrayList<DetTipoconsumoTarifa>) CTC.Read());
        if (DE.getTarifas_Guardadas().isEmpty()) {
            if (opcion) {
                JOptionPane.showMessageDialog(
                        null,
                        "No hay registros para mostrar",
                        "Tarifas",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void CargarDescuentos(boolean opcion) {
        CTC.setOpcion(1);
        DE.setDescuentos_Guardados((ArrayList<Cat_descuento>) CTC.Read());
        if (DE.getDescuentos_Guardados().isEmpty()) {
            if (opcion) {
                JOptionPane.showMessageDialog(
                        null,
                        "No hay registros para mostrar",
                        "Descuentos",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
