public class Admin {
    private String nome;

    public Admin(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Profissional cadastrarProfissional(String nome) {
        Profissional pro = new Profissional(nome);

        System.out.println("Profissional " + nome + " cadastrado pelo sistema!");

        return pro;
    }

    void consultarAgenda() {
    }

    void consultarRelatorio() {
    }
}
