public class Unha extends Atendimento {
    private String tipo;
    private String cor;
    private String local;

    public Unha(String servico, float valor, String tipo, String cor, String local) {
        super(servico, valor);
        this.tipo = tipo;
        this.cor = cor;
        this.local = local;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 

    public String getTipo() {
        return tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public double calcularValor() {
        this.valor = 70;
        
        switch (tipo) {
            case "gel":
                this.valor = (5 * 1.5);
                break;

            case "acrílica":
                this.valor = (4 * 1.7);
                break;

            case "esmaltação":
                this.valor = (3 * 1.3);
                break;                

            case "limpeza":
                this.valor = (2 * 1.4);
                break;

            default:
                break;
        }

        switch (local) {
            case "mão":
                this.valor = this.valor + (2 * 1.3);
                break;

            case "pé":
                this.valor = this.valor + (4 * 1.5);
                break;

            case "ambos":
                this.valor = this.valor + (6 * 1.7);
                break;                

            default:
                break;
        }

        return this.valor;
    }
}
