
public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente(
				"Ciclano","111.222.333-44");
		
		g.setSalario(5500);
		
		System.out.println(g);
		System.out.println("Salario: "
				+g.getSalario());
		System.out.println("Bonificação: "
				+g.getBonificacao());
		
	}

}
