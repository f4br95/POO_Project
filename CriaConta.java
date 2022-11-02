public class CriaConta {

	public static void main(String[] args) {
		Cliente cliente = 
				new Cliente(
						"Filipe",
						"123456789");
		
		Conta primeiraConta = new ContaCorrente(123,123456);
		primeiraConta.deposita(200);
		primeiraConta.deposita(500);
		primeiraConta.setTitular(cliente);
		
		System.out.println("Qtde1: " 
		+ Conta.getQuantidadeContas());
		
		Conta segundaConta = new ContaCorrente(123,654321);
		segundaConta.deposita(50);
		
		System.out.println("Qtde2: " 
				+ Conta.getQuantidadeContas());
		
		primeiraConta.saca(150);
		
		primeiraConta.transfere(
				200,segundaConta);
		
		System.out.println(
				"Saldo da primeira conta: "+
				primeiraConta.saldo());
		
		System.out.println(
				"Saldo da segunda conta: "+
				segundaConta.saldo());
		
		Conta c3 = new ContaCorrente(1,1);
		Conta c4 = new ContaCorrente(1,2);
		Conta c5 = new ContaCorrente(1,3);
		Conta c6 = new ContaCorrente(1,4);
		
		System.out.println(Conta.getQuantidadeContas());

	}

}
