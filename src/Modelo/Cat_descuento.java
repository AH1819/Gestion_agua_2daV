package Modelo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

public class Cat_descuento {

    @Getter
    @Setter
    private Integer id_desc;
    @Getter
    @Setter
    private Date fecha_inc;
    @Getter
    @Setter
    private Date fecha_fin;
    @Getter
    @Setter
    private String descripcion;
    @Getter
    @Setter
    private Double porcentaje;
    @Getter
    @Setter
    private String status;
}
