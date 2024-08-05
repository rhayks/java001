package lojas.dados;

import lojas.servico.Rastreio;

public class Fornecedor extends Pessoa implements Rastreio {
    private final Telefone telefone;
    private String statusAtual;

    public Fornecedor(String nomeCompleto, Endereco endereco, Telefone telefone) {
        super(nomeCompleto, endereco);
        this.telefone = telefone;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Fornecedor: " + getNomeCompleto());
    }

    @Override
    public void atualizarStatus(String status) {
        this.statusAtual = status;
        System.out.println("Status do fornecimento atualizado para: " + status);
    }

    @Override
    public String obterStatusAtual() {
        return statusAtual;
    }

    public Telefone getTelefone() {
        return telefone;
    }
}
