
public class TestaReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("A","1");
		g1.setSalario(5000);
		
		Funcionario f1 = new Gerente("B","2");
		f1.setSalario(2500);
		
		ControleBonificacao controle = 
				new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(f1);
		
		System.out.println(controle.getSoma());
		
		

	}

}
