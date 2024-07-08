public class Pedido {

    int idCompra;
    String data;
    Cliente cliente;
    Produto produto;

    public Pedido (int idCompra, String data, Cliente cliente, Produto produto){
        this.idCompra = idCompra;
        this.data = data;
        this.cliente = cliente;
        this.produto = produto;
    }
    public int getIdCompra(){
        return idCompra;
    }
    public void setIdCompra(int idCompra){
        this.idCompra = idCompra;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente (Cliente cliente){
        this.cliente = cliente;
    }
    public Produto getProduto(){
        return produto;
    }
    public void setProduto (Produto produto){
        this.produto = produto;
    }
}
