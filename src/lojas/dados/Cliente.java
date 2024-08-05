package lojas.dados;

import lojas.servico.Rastreio;

public class Cliente extends Pessoa implements Rastreio {
    private final String anoQueNasceu;
    private final Telefone telefone;
    private String statusAtual;

    public Cliente(String nomeCompleto, Endereco endereco, String anoQueNasceu, Telefone telefone) {
        super(nomeCompleto, endereco); // chamar o construtor da classe mãe
        this.anoQueNasceu = anoQueNasceu;
        this.telefone = telefone;
    }

    @Override //indicar q esta subescrevendo um médoto da superclasse ou de uma interface
    public void exibirDetalhes() {
        System.out.println("Cliente: " + getNomeCompleto() + ", Ano de Nascimento: " + anoQueNasceu);
    }


    public void atualizarStatus() {
        atualizarStatus(null);
    }

    @Override
    public void atualizarStatus(String status) {
        this.statusAtual = status;
        System.out.println("Status do pedido do cliente atualizado para: " + status);
    }

    @Override
    public String obterStatusAtual() {
        return statusAtual;
    }

    public Telefone getTelefone() {
        return telefone;
    }
}
