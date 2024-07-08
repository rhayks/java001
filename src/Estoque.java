public class Estoque {

    int quantidade;
    Produto produto;

    public Estoque (int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public int getQuantiade(){
        return quantidade;
    }
    public void setQuantiade(int quantiade){
        this.quantidade = quantiade;
    }
    public Produto produto(){
        return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }

}
