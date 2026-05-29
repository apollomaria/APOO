public class Cabelo extends Atendimento {
    private String tipo;
    private String corte;
    private String tamanho;
    private String procedimento;

    public Cabelo(String servico, float valor, String tipo, String corte, String tamanho, String procedimento) {
        super(servico, valor); 
        this.tipo = tipo;
        this.corte = corte;
        this.tamanho = tamanho;
        this.procedimento = procedimento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getCorte() {
        return corte;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getProcedimento() {
        return procedimento;
    }

    @Override
    public double calcularValor() {

        switch (tamanho) {
            case "curto":
                this.valor = (float) (this.valor * 1.2);
                break;

            case "médio":
                this.valor = (float) (this.valor * 1.7);
                break;

            case "longo":
                this.valor = (float) (this.valor * 2.2);
                break;

            default:
                break;
        }

        switch (procedimento) {
            case "corte":
                this.valor = (float) (this.valor * 1.2);
                break;

            case "hidratação":
                this.valor = (float) (this.valor * 1.7);
                break;

            case "pintura":
                this.valor = (float) (this.valor * 2.2);
                break;

            default:
                break;
        }

        return this.valor;
    }
}
