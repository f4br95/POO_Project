
public class Gerente extends Funcionario {
	
	public double bonificacao;
	private int senha;

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public double getBonificacao() {
		return this.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		return this.senha==senha;
	}

}
