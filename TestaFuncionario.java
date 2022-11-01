
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f = new Atendente(
				"Fulano de Tal", 
				"123.456.789-10");
		f.setSalario(3000);
		
		System.out.println(f);
		System.out.println("Salario: "+f.getSalario());
		System.out.println("Bonificação: "+
				f.getBonificacao());
		
	}

}
