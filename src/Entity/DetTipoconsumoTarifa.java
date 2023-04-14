package Entity;

public class DetTipoconsumoTarifa {

    private Integer consec;
    private Integer id_consumo;
    private String tipo_consumo;
    private Double tarifa;

    public DetTipoconsumoTarifa() {
    }

    public DetTipoconsumoTarifa(Integer consec, Integer id_consumo, Double tarifa) {
        this.consec = consec;
        this.id_consumo = id_consumo;
        this.tarifa = tarifa;
    }

    public DetTipoconsumoTarifa(Integer consec, Integer id_consumo, String tipo_consumo, Double tarifa) {
        this.consec = consec;
        this.id_consumo = id_consumo;
        this.tipo_consumo = tipo_consumo;
        this.tarifa = tarifa;
    }

    public Integer getConsec() {
        return consec;
    }

    public void setConsec(Integer consec) {
        this.consec = consec;
    }

    public Integer getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(Integer id_consumo) {
        this.id_consumo = id_consumo;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public String getTipo_consumo() {
        return tipo_consumo;
    }

    public void setTipo_consumo(String tipo_consumo) {
        this.tipo_consumo = tipo_consumo;
    }

}
