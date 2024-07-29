public class Devolucao {

    private Pagamento pagamento;
    private Produto produto;

    public Devolucao (Pagamento pagamento, Produto produto){
        this.pagamento = pagamento;
        this.produto = produto;
    }
    public Pagamento getPagamento(){
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }
    public Produto getProduto(){
       return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
}
