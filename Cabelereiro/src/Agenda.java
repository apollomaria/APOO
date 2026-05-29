import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private LocalDate data;
    private List<Atendimento> atendimentos;

    // COMPOSIÇÃO (Agenda é PAI de Atendimento, Profissional e Cliente)
    private Atendimento atendimento;
    private Profissional profissional;
    private Cliente cliente;

    private Agenda(LocalDate data) {
        this.data = data;
        this.atendimentos = new ArrayList<>();

        // COMPOSIÇÃO (Agenda é PAI de Atendimento, Profissional e Cliente)
        this.atendimento = new Atendimento(this);
        this.profissional = new Profissional(this);
        this.cliente = new Cliente();
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
    
    public void adicionarAtendimento(Atendimento novoAtendimento) {
        this.atendimentos.add(novoAtendimento);
    }


    
    public void consultarAgenda() {
        // FAZER ----------------------------------------------------------
    }

}
