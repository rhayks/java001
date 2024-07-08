
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua AZUL", "Brasília", "Destrito Federal", "12345-678");
        Telefone telefone = new Telefone("1234-5678");
        Loja loja = new Loja("Renner", endereco, telefone);


        System.out.println("Nome da loja: " + loja.getNome());
        loja.mostrarEndereco();
        System.out.println("Telefone: " + loja.getTelefone().getNumero());
    }
}



