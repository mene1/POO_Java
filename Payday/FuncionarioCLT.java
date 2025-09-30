package Q1;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nomeCompleto, String cpf, double salario) throws IllegalArgumentException{
        super(nomeCompleto, cpf, salario);
    }

    @Override
    public double calcularBeneficios(){
        return 0.06 * salario + 500;
    }
}
