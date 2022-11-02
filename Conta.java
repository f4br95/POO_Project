public abstract class Conta {
	
	private double saldo;	
	private int agencia;
	private int numero;	
	private Cliente titular;
	private static int quantidadeContas=0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.quantidadeContas++;
	}
	
	public static int getQuantidadeContas( ) {
		return Conta.quantidadeContas;
	}
	
	public double saldo() {
		return this.saldo;
	}

	public void addSaldo(double valor){
		this.saldo += valor;
	}
	
	public abstract void deposita(double valor); 
	
	
	public abstract boolean saca(double valor);
		

	public boolean transfere(
		double valor, Conta destino) {
		
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
				
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero( ) {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Titular: "+titular.getNome()+", Conta: "+this.numero+", Agencia: "+this.agencia;
	}
		
}
