public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;
		
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		
		return String.format(
				"Nome: %s, CPf: %s, Profissão: %s", 
				nome, 
				cpf,
				profissao);
		
		/*
		return "Nome: "+nome+", "
				+ "CPF: "+cpf+", "
				+ "Profissão: "+profissao;
		*/		
	}

}
