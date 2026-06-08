import java.time.LocalDate;

public class Recepcionista {
    private String nome;

    public Recepcionista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente cadastrarCliente(String nome, String cpf, String telefone,
            String numeroCartao, String codigoSegurancaCartao, boolean VIP) {
        Cliente cli = new Cliente(nome, cpf, telefone, numeroCartao, codigoSegurancaCartao, VIP);
        System.out.println("Cliente " + nome + " cadastrado com sucesso!");
        return cli;
    }

    public Agenda marcarAgenda(Cliente cliente, Profissional profissional, Atendimento atendimento) {
        LocalDate hoje = LocalDate.now();
        Agenda agenda = new Agenda(hoje, cliente, profissional, atendimento);
        System.out.println("\nAgenda marcada para " + cliente.getNome()
                + " com " + profissional.getNome()
                + " em " + hoje);
        return agenda;
    }
}
