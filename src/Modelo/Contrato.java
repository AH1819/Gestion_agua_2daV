package Modelo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

public class Contrato {

    @Getter @Setter private Integer folioContrato;
    @Getter @Setter private String municipio;
    @Getter @Setter private String residencia;
    @Getter @Setter private String nombreCalle;
    @Getter @Setter private String calleReferencia;
    @Getter @Setter private String observaciones;
    @Getter @Setter private Integer numeroMzn;
    @Getter @Setter private Integer numeroLt;
    @Getter @Setter private Integer consec;
    @Getter @Setter private Integer id_consumo;
    @Getter @Setter private Integer id_periodo;
    @Getter @Setter private Double deuda;
    @Getter @Setter private Integer folio_cte;
    @Getter @Setter private String status;
    @Getter @Setter private String tipo_consumo;
    @Getter @Setter private String tipo_periodo;
    @Getter @Setter private String nombre;
    @Getter @Setter private Date creacion_contrato;
    
}
