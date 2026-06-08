public abstract class Atendimento {

    protected String servico;
    protected double valor;

    // COMPOSIÇÃO (Atendimento é FILHO de Agenda)
    private Agenda agendaPai;
    public Atendimento(Agenda pai) {
		this.agendaPai = pai;
	}

    // COMPOSIÇÃO (Atendimento é PAI de Pagamento)
    private Pagamento pagamento;

    public Atendimento(String servico, double valor) {
        this.servico = servico;
        this.valor = valor;

        // COMPOSIÇÃO (Atendimento é PAI de Pagamento: ele quem CRIA Pagamento)
        this.pagamento = new Pagamento(this);
    }

    public String getServico() {
        return servico;
    }

    public abstract double calcularValor();
}