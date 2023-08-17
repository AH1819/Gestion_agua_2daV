package Modelo;

public class Ticket {
    private Integer cns;
    private Integer idticket;
    private Integer idLectPago;

    public Ticket() {
    }

    public Ticket(Integer cns, Integer idLectPago) {
        this.cns = cns;
        this.idLectPago = idLectPago;
    }

    public Integer getCns() {
        return cns;
    }

    public void setCns(Integer cns) {
        this.cns = cns;
    }
    
    public Integer getIdticket() {
        return idticket;
    }

    public void setIdticket(Integer idticket) {
        this.idticket = idticket;
    }

    public Integer getIdLectPago() {
        return idLectPago;
    }

    public void setIdLectPago(Integer idLectPago) {
        this.idLectPago = idLectPago;
    }
    
}

