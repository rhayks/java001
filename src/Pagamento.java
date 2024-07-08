public class Pagamento {

    String tipoDePagemento;
    Pedido pedido;
    Produto produto;

    public Pagamento(String tipoDePagemento, Pedido pedido, Produto produto){
        this.tipoDePagemento = tipoDePagemento;
        this.produto = produto;
        this.pedido = pedido;
    }
    public String getTipoDePagemento(){
        return tipoDePagemento;
    }
    public void setTipoDePagemento(String tipoDePagemento){
        this.tipoDePagemento = tipoDePagemento;
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
