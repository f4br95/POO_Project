public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, int agencia){
        super(numero, agencia);}


    @Override
    public void deposita(double valor) {
		if (valor>0)
			this.saldo += valor;
        }
			
        
	@Override
	public boolean saca(double valor) {
		if (valor<=0) {
			return false;
		} else if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
    
}
