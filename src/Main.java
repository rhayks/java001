import lojas.servico.Pagamento;
import lojas.servico.Pedido;
import lojas.dados.*;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua AZUL", "Brasília", "Distrito Federal", "12345-678");
        Telefone telefone = new Telefone("61", "1234-5678");

        Funcionario funcionario = new Funcionario("João Silva", endereco, "123.456.789-00", "Caixa", 2500);
        Cliente cliente = new Cliente("Rafaela Cardoso", endereco, "1995", telefone);

        Loja loja = new Loja("Renner", endereco, telefone);
        System.out.println("Nome da loja: " + loja.getNome());
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Estado: " + endereco.getEstado());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("DDD: " + telefone.getDDD());
        System.out.println("Número: " + telefone.getNumero());

        Fornecedor fornecedor = new Fornecedor("Fornecedor Junior", endereco, telefone);
        System.out.println("Fornecedor:");



        Produto produto = new Produto("Eletrônicos", 1500);
        Pedido pedido = new Pedido(1, "2024-07-08", cliente, produto);
        Pagamento pagamento = new Pagamento("Cartão", pedido, produto);

        System.out.println("Produto: " + produto.getDepartamento() + " - R$ " + produto.getPreco());
        System.out.println("Tipo de Pagamento: " + pagamento.getTipoDePagamento());

        funcionario.exibirDetalhes();
        cliente.exibirDetalhes();
        fornecedor.exibirDetalhes();

        cliente.atualizarStatus("Pedido enviado");
        System.out.println("Status atual do pedido do cliente: " + cliente.obterStatusAtual());


        fornecedor.atualizarStatus("Fornecimento em trânsito");
        System.out.println("Status atual do fornecimento: " + fornecedor.obterStatusAtual());
    }
    }


