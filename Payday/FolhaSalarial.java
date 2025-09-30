package Q1;

import java.util.ArrayList;
import java.util.List;

public class FolhaSalarial{
    private List<Funcionario> funcionarios;

    public FolhaSalarial(){
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void gerarExtratoGeral(){
        System.out.println("\n- Extrato Geral:");
        for (Funcionario funcionario : funcionarios){
            System.out.println("CPF: " + funcionario.getCpf() +
                    ", Salário: R$ " + funcionario.getSalario() +
                    ", Benefícios: R$ " + funcionario.calcularBeneficios());
        }
    }

    public double calcularValorTotalFolha(){
        double total = 0;
        for (Funcionario funcionario : funcionarios){
            total += funcionario.getSalario();
        }
        return total;
    }

    public double calcularValorTotalBeneficios(){
        double total = 0;
        for (Funcionario funcionario : funcionarios){
            total += funcionario.calcularBeneficios();
        }
        return total;
    }
}
