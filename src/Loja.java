public class Loja {

    private String nome;
    private Endereco endereco;
    private Telefone telefone;

    public Loja(String nome, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void mostrarEndereco() {
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Estado: " + endereco.getEstado());
        System.out.println("CEP: " + endereco.getCep());
    }

    public void mostrarTelefone() {
        System.out.println("DDD: " + telefone.getDDD());
        System.out.println("Numero: " + telefone.getNumero());
    }
}
