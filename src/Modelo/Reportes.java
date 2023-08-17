package Modelo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

public class Reportes {

    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String meses_adeudo;
    @Getter
    @Setter
    private Double cantidad;
    @Getter
    @Setter
    private Double total_deuda;
    @Getter
    @Setter
    private Date fecha_creacion;

}
