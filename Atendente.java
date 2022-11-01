public class Atendente extends Funcionario {
    public Atendente(String nome, String cpf){
        super( nome,  cpf);
    }
    
    @Override
    public double getBonificacao() {
        return 100;
}
}
