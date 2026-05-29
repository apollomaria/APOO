public class Atendimento {
    protected String servico;
    protected float valor;

    // COMPOSIÇÃO (Atendimento é FILHO de Agenda)
    private Agenda agendaPai;
    public Atendimento(Agenda pai) {
		this.agendaPai = pai;
	}

    // COMPOSIÇÃO (Atendimento é PAI de Pagamento)
    private Pagamento pagamento;

    // CONSTRUTOR
    public Atendimento(String servico, float valor) {
        this.servico = servico;
        this.valor = valor;

        // COMPOSIÇÃO (Atendimento é PAI de Pagamento: ele quem CRIA Pagamento)
        this.pagamento = new Pagamento(this);
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getServico() {
        return servico;
    }

    public double calcularValor() {
        return this.valor;
    }



}
