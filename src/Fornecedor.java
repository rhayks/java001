public class Fornecedor {

    String nomeDoFornecedor;
    Endereco endereco;
    Telefone telefone;

    public Fornecedor (String nomeDoFornecedor, Endereco endereco, Telefone telefone){
        this.nomeDoFornecedor = nomeDoFornecedor;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNomeDoFornecedor(){
        return nomeDoFornecedor;
    }
    public void setNomeDoFornecedor(String nomeDoFornecedor){
        this.nomeDoFornecedor = nomeDoFornecedor;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Telefone getTelefone(){
        return telefone;
    }
    public void setTelefone(Telefone telefone){
        this.telefone = telefone;
    }

}
