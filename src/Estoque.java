public class Estoque {

    private int quantidade;
    private Produto produto;

    public Estoque (int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public Produto produto(){
        return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }

}
