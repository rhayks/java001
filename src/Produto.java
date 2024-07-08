public class Produto {

    String departamento;
    int preco;

    public Produto (String departaemento, int preco) {
        this.departamento = departaemento;
        this.preco = preco;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }

}
