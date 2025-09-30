package Q1;

public class FuncionarioPJ extends Funcionario{
    private String cnpj;

    public FuncionarioPJ(String nomeCompleto, String cpf, String cnpj, double salario){
        super(nomeCompleto, cpf, salario);
        this.cnpj = cnpj;
    }

    @Override
    public double calcularBeneficios(){
        return 500;
    }
}
