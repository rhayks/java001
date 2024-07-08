public class Telefone {
    int DDD;
    String numero;

    public Telefone (String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public Telefone (int DDD) {
        this.DDD = DDD;
    }
    public int getDDD() {
        return DDD;
    }
}
