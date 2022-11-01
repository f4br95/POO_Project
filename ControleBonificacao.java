
public class ControleBonificacao {
	
	private double soma=0;
	
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return this.soma;
	}

}
