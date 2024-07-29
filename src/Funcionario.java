public class Funcionario {

        private String nomeCompleto;
        private String CPF;
        private String funcao;
        private int salario;

        public Funcionario(String nomeCompleto, String CPF, String funcao, int salario) {
                this.nomeCompleto = nomeCompleto;
                this.CPF = CPF;
                this.funcao = funcao;
                this.salario = salario;
        }

        public String getNomeCompleto() {
                return nomeCompleto;
        }

        public void setNomeCompleto(String nomeCompleto) {
                this.nomeCompleto = nomeCompleto;
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
        public void setSalario(int salario){
                this.salario = salario;
        }
}
