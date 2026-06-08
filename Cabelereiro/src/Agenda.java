import java.time.LocalDate;

public class Agenda {

    private LocalDate data;

     // COMPOSIÇÃO (Agenda é PAI de Atendimento, Profissional e Cliente)
    private Cliente cliente;
    private Profissional profissional;
    private Atendimento atendimento;

    public Agenda(LocalDate data, Cliente cliente, Profissional profissional, Atendimento atendimento) {
        this.data = data;
        this.cliente = cliente;
        this.profissional = profissional;
        this.atendimento = atendimento;
    }

    public void consultarAgenda() {
        System.out.println("\n============ AGENDAMENTO ============");
        System.out.println("Data:                  " + data);
        System.out.println("Cliente:               " + cliente.getNome());
        System.out.println("Profissional:          " + profissional.getNome());
        System.out.println("Serviço:               " + atendimento.getServico());

        // Exibe detalhes específicos conforme o tipo de atendimento
        if (atendimento instanceof Cabelo) {
            Cabelo c = (Cabelo) atendimento;
            System.out.println("  Tipo de cabelo:  " + c.getTipo());
            System.out.println("  Corte:           " + c.getCorte());
            System.out.println("  Tamanho:         " + c.getTamanho());
            System.out.println("  Procedimento:    " + c.getProcedimento());
        } else if (atendimento instanceof Unha) {
            Unha u = (Unha) atendimento;
            System.out.println("  Tipo de unha:    " + u.getTipo());
            System.out.println("  Cor:             " + u.getCor());
            System.out.println("  Local:           " + u.getLocal());
        }

        System.out.printf("Valor:         R$ %.2f%n", atendimento.calcularValor());
    }

}
