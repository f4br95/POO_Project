public class Caixa extends Funcionario {
    public Caixa(String nome, String cpf){
        super(nome, cpf);
    }
    
    @Override
    public double getBonificacao(){
        return 100;
    }
}
