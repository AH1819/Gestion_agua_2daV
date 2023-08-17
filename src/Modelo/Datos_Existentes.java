package Modelo;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

public class Datos_Existentes {

    @Getter
    @Setter
    private static ArrayList<Contrato> Contratos_Guardados;
    @Getter
    @Setter
    private static ArrayList<Cliente> Clientes_Guardados;
    @Getter
    @Setter
    private static ArrayList<Cat_Consumo> Consumos_Guardados;
    @Getter
    @Setter
    private static ArrayList<Cat_periodo> Periodos_Guardados;
    @Getter
    @Setter
    private static ArrayList<DetTipoconsumoTarifa> Tarifas_Guardadas;
    @Getter
    @Setter
    private static ArrayList<Cat_descuento> Descuentos_Guardados;
    @Getter
    @Setter
    private static ArrayList<Cat_pago> Tipos_Guardados;
    @Getter
    @Setter
    private static ArrayList<LecturaPago> Lecturas_Guardadas;
    @Getter
    @Setter
    private static ArrayList<Reportes> Reportes_Guardados;
}
