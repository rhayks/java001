public class Pagamento {

    private String tipoDePagamento;
    private Pedido pedido;
    private Produto produto;

    public Pagamento(String tipoDePagamento, Pedido pedido, Produto produto){
        this.tipoDePagamento = tipoDePagamento;
        this.produto = produto;
        this.pedido = pedido;
    }
    public String getTipoDePagamento(){
        return tipoDePagamento;
    }
    public void setTipoDePagamento(String tipoDePagamento){
        this.tipoDePagamento = tipoDePagamento;
    }
    public Pedido getPedido(){
        return pedido;
    }
    public void setProduto (Pedido pedido){
        this.pedido = pedido;
    }
    public Produto getProduto(){
        return produto;
    }
    public void setProduto (Produto produto){
        this.produto = produto;
    }
}
