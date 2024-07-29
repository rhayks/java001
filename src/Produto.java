public class Produto {

    private String departamento;
    private int preco;

    public Produto (String departamento, int preco) {
        this.departamento = departamento;
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
