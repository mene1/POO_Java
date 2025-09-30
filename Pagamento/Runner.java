package Q1;

public class Runner{
    public static void main(String[] args){
        FolhaSalarial folha = new FolhaSalarial();

        try{
            //adiciona CLT
            Funcionario clt1 = new FuncionarioCLT("João Silva", "12345678900", 1500);
            folha.adicionarFuncionario(clt1);
            System.out.println("\n- Funcionário CLT adicionado: " + clt1.getCpf());
        } catch (IllegalArgumentException e){
            System.err.println("\n- Erro ao adicionar CLT: " + e.getMessage());
        }      
        
        try{
            //adicinona PJ
            Funcionario pj1 = new FuncionarioPJ("Maria Oliveira", "98765432100", "11223344556677", 4000);
            folha.adicionarFuncionario(pj1);
            System.out.println("\n- Funcionário PJ adicionado: " + pj1.getCpf());
        } catch (IllegalArgumentException e){
            System.err.println("\n- Erro ao adicionar PJ: " + e.getMessage());
        }

        try{
            //adiciona CLT com salario baixo
            Funcionario clt2 = new FuncionarioCLT("Pedro Santos", "19283746500", 1200);
            folha.adicionarFuncionario(clt2);
        } catch (IllegalArgumentException e){
            System.err.println("\n- Erro ao adicionar CLT 2: " + e.getMessage());
        }

        //extrato geral
        folha.gerarExtratoGeral();

        //valor folha
        System.out.println("\n- Valor total da folha: R$ " + folha.calcularValorTotalFolha());

        //valor beneficios
        System.out.println("- Valor total de benefícios pagos: R$ " + folha.calcularValorTotalBeneficios());
    }
}
