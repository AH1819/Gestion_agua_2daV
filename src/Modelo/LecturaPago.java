package Modelo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

public class LecturaPago {

    @Getter
    @Setter
    private Integer idLectPago;
    @Getter
    @Setter
    private Date fechaHora;
    @Getter
    @Setter
    private Double lecturaIni;
    @Getter
    @Setter
    private Double lecturaFin;
    @Getter
    @Setter
    private Double consumo;
    @Getter
    @Setter
    private Double importe;
    @Getter
    @Setter
    private Double pagado;
    @Getter
    @Setter
    private Double adeudo;
    @Getter
    @Setter
    private String status;
    @Getter
    @Setter
    private Integer folio_contrato;
    @Getter
    @Setter
    private Integer folio_cliente;
    @Getter
    @Setter
    private String nombre_cliente;
    @Getter
    @Setter
    private Integer id_m;
    @Getter
    @Setter
    private String mes;
    @Getter
    @Setter
    private String tipo_periodo;
    @Getter
    @Setter
    private String Tiempo_transcurrido;

}
