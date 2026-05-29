public class Pagamento {
    private Atendimento atendimentoPai;
    private String formaDePagamento;

    public Pagamento(Atendimento pai) {
		this.atendimentoPai = pai;
	}

    public Pagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public float verificarDesconto(float valor, boolean VIP) {

        if (VIP) {
            valor = (float) (valor * 0.1);
        } 

        return valor;
    }    



}
