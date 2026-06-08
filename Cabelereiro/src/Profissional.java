public class Profissional {
    private String nome;

    // COMPOSIÇÃO (Profissional é FILHO de Agenda)
    private Agenda agendaPai;
    public Profissional(Agenda pai) {
		this.agendaPai = pai;
	}

    public Profissional(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
