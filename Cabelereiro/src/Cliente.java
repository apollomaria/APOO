public class Cliente {
    private String nome;    
    private String cpf;
    private String telefone;
    private String numeroCartao;
    private String codigoSegurancaCartao;
    private boolean VIP;
 
    // COMPOSIÇÃO (Cliente é FILHO de Agenda)
    private Agenda agendaPai;
    public Cliente(Agenda pai) {
		this.agendaPai = pai;
	}

    public Cliente(String nome, String cpf, String telefone, String numeroCartao, String codigoSegurancaCartao, boolean VIP) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.numeroCartao = numeroCartao;
        this.codigoSegurancaCartao = codigoSegurancaCartao;
        this.VIP = VIP;
    }

    public Cliente() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getCodigoSegurancaCartao() {
        return codigoSegurancaCartao;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public boolean getVIP() {
        return VIP;
    }
}
