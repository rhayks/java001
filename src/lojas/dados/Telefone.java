package lojas.dados;

public class Telefone {
    private String DDD;
    private String numero;


    public Telefone(String DDD, String numero) {
        this.DDD = DDD;
        this.numero = numero;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}