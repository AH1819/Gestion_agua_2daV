package Modelo;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

public class Cliente {

    @Getter
    @Setter
    private Integer folio_cliente;
    @Getter
    @Setter
    private Integer folio_contrato;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String apellido_p;
    @Getter
    @Setter
    private String apellido_m;
    @Getter
    @Setter
    private Date fecha_nac;
    @Getter
    @Setter
    private String telefono;
    @Getter
    @Setter
    private String celular;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String curp;
    @Getter
    @Setter
    private String rfc;
    @Getter
    @Setter
    private String municipio;
    @Getter
    @Setter
    private String residencia;
    @Getter
    @Setter
    private String nombre_calle;
    @Getter
    @Setter
    private String calle_referencia;
    @Getter
    @Setter
    private int numero_manzana;
    @Getter
    @Setter
    private int numero_lote;
    @Getter
    @Setter
    private String status = "activo";
    @Getter
    @Setter
    private double deuda;
    @Getter
    @Setter
    private String consumo;

}
