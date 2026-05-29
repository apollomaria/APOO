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
        switch (tipo) {
            case "gel":
                this.valor = (float) (this.valor * 1.5);
                break;

            case "acrílica":
                this.valor = (float) (this.valor * 1.7);
                break;

            case "esmaltação":
                this.valor = (float) (this.valor * 1.3);
                break;                

            case "limpeza":
                this.valor = (float) (this.valor * 1.4);
                break;

            default:
                break;
        }

        switch (local) {
            case "mão":
                this.valor = (float) (this.valor * 1.3);
                break;

            case "pé":
                this.valor = (float) (this.valor * 1.5);
                break;

            case "ambos":
                this.valor = (float) (this.valor * 1.7);
                break;                

            default:
                break;
        }

        return this.valor;
    }
}
