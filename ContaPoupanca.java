public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, int agencia){
        super(numero, agencia);}


        @Override
        public void deposita(double valor) {
            if (valor>0)
            {
                addSaldo(valor);
            }
            }
                
            
    @Override
        public boolean saca(double valor) {
            double valorASacar = valor + 0.01;
            if (valor<=0) {
                return false;
            } else if (saldo() >= valor) {
                addSaldo(valorASacar*-1);
                return true;
            } else {
                return false;
            }
        }
    
}
