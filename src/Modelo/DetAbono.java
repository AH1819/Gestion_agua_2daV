package Modelo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class DetAbono {

    @Getter
    @Setter
    private Integer consec;
    @Getter
    @Setter
    private Date fechaHora;
    @Getter
    @Setter
    private Double abono;
    @Getter
    @Setter
    private Double saldo;
    @Getter
    @Setter
    private Integer id_lectura_pago;
    @Getter
    @Setter
    private double porcentaje;
    @Getter
    @Setter
    private Integer id_tipo_pago;
    @Getter
    @Setter
    private String tipo_pago;
    @Getter
    @Setter
    private String folio_ventanilla;
    @Getter
    @Setter
    private int id_desc;
    @Getter
    @Setter
    private double pagado;
    @Getter
    @Setter
    private double importe;
}
