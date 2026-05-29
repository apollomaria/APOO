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

    public void gerenciar(Agenda agendaDoDia) {
        agendaDoDia.consultarAgenda();
    }

    public Cliente cadastrarCliente(String nome, String cpf, String telefone, String numeroCartao, String codigoSegurancaCartao, boolean VIP) {
        Cliente cli = new Cliente(nome, cpf, telefone, numeroCartao, codigoSegurancaCartao, VIP);
        System.out.println("Cliente " + nome + " cadastrado com sucesso!");
        return cli;
    }

    public String marcarAgenda(Profissional nomeProfissional, Atendimento tipo, Cliente nomeCliente, Agenda data) {
        String info = "\nROFISSIONAL: " + nomeProfissional + "\nTIPO de Atendimento: " + tipo + "\nNome do Cliente: " + nomeCliente;
        return info;
    }



}
