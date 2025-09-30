package Q1;

public abstract class Funcionario{
    protected String nomeCompleto;
    protected String cpf;
    protected double salario;

    public Funcionario(String nomeCompleto, String cpf, double salario) throws IllegalArgumentException{
        if (salario < 1320){
            throw new IllegalArgumentException("Salário não pode ser menor que R$1.320");
        }
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getCpf(){
        return cpf;
    }

    public double getSalario(){
        return salario;
    }

    public abstract double calcularBeneficios();
}