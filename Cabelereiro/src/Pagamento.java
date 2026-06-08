public class Pagamento {
    private String formaDePagamento;

    private Atendimento atendimentoPai;
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
            valor = (float) (valor * 0.9);
        }
        return valor;
    }
}
