public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua AZUL", "Brasília", "Distrito Federal", "12345-678");
        Telefone telefone = new Telefone("61", "1234-5678");
        Loja loja = new Loja("Renner", endereco, telefone);

        System.out.println("Nome da loja: " + loja.getNome());
        loja.mostrarEndereco();
        loja.mostrarTelefone();


        Funcionario funcionario = new Funcionario("João Silva", "123.456.789-00", "Caixa", 2500);
        System.out.println("Nome do funcionário: " + funcionario.getNomeCompleto());
        System.out.println("CPF do funcionário: " + funcionario.getCPF());
        System.out.println("Função do funcionário: " + funcionario.getFuncao());
        System.out.println("Salário do funcionário: " + funcionario.getSalario());


        Cliente cliente = new Cliente("Rafaela Cardoso", "1995", telefone);
        Produto produto = new Produto("Eletrônicos", 1500);
        Pedido pedido = new Pedido(1, "2024-07-08", cliente, produto);
        Pagamento pagamento = new Pagamento("Cartão", pedido, produto);


        System.out.println("Cliente: " + cliente.getNomeCompleto());
        System.out.println("Data do Pedido: " + pedido.getData());
        System.out.println(("ID Compra: "+ pedido.getIdCompra()));
        System.out.println("Produto: " + produto.getDepartamento() + " - R$ " + produto.getPreco());
        System.out.println("Pagamento: " + pagamento.getTipoDePagamento());
    }
}
