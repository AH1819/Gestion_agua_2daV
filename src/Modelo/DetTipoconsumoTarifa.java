package Modelo;

import lombok.Getter;
import lombok.Setter;

public class DetTipoconsumoTarifa {

    @Getter
    @Setter
    private Integer consec;
    @Getter
    @Setter
    private Integer consumo_act;
    @Getter
    @Setter
    private Integer id_consumo;
    @Getter
    @Setter
    private String tipo_consumo;
    @Getter
    @Setter
    private Double tarifa;
}
