public class Cliente {

    private String nomeCompleto;
    private String anoQueNasceu;
    private Telefone telefone;

    public Cliente (String nomeCompleto, String anoQueNasceu, Telefone telefone) {
        this.nomeCompleto = nomeCompleto;
        this.anoQueNasceu = anoQueNasceu;
        this.telefone = telefone;
    }
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public void setNomeCompleto (String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public String getAnoQueNasceu(){
        return  anoQueNasceu;
    }
    public void setAnoQueNasceu(String anoQueNasceu){
        this.anoQueNasceu = anoQueNasceu;
    }
    public Telefone getTelefone (){
        return telefone;
    }
    public void setTelefone(Telefone telefone){
        this.telefone = telefone;
    }
    }
