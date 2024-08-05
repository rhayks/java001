package lojas.dados;

public class Funcionario extends Pessoa {
        private String CPF;
        private String funcao;
        private int salario;

        public Funcionario(String nomeCompleto, Endereco endereco, String CPF, String funcao, int salario) {
                super(nomeCompleto, endereco);
                this.CPF = CPF;
                this.funcao = funcao;
                this.salario = salario;
        }

        public String getCPF() {
                return CPF;
        }

        public void setCPF(String CPF) {
                this.CPF = CPF;
        }

        public String getFuncao() {
                return funcao;
        }

        public void setFuncao(String funcao) {
                this.funcao = funcao;
        }

        public int getSalario() {
                return salario;
        }

        public void setSalario(int salario) {
                this.salario = salario;
        }

        @Override
        public void exibirDetalhes() {
                System.out.println("Nome do Funcionário: " + getNomeCompleto());
                System.out.println("Endereço: " + getEndereco().getRua() + ", " + getEndereco().getCidade() + ", " + getEndereco().getEstado() + ", " + getEndereco().getCep());
                System.out.println("CPF: " + getCPF());
                System.out.println("Função: " + getFuncao());
                System.out.println("Salário: " + getSalario());
        }
}
