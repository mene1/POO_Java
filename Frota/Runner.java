    public class Runner{
    public static void main(String[] args){
        Frota frota = new Frota();

        // cadastra veiculos
        frota.cadastrarVeiculo("QUE2076", "Tesla");
        frota.cadastrarVeiculo("CSI1979", "Kwid");

        // registra abastecimentos
        frota.registraAbastecimento("QUE2076", "20-08-2024", 12000, 150.0, 20.0);
        frota.registraAbastecimento("CSI1979", "01-08-2024", 8000, 300.0, 40.0);
        frota.registraAbastecimento("QUE2076", "12-08-2024", 12200, 100.0, 15.0);

        // emite relatorios
        System.out.println("\nConsumo Total (litros): " + frota.emitirConsumoTotal());
        System.out.println("\nGasto Total em Reais: " + frota.emitirGastoTotal());
        System.out.println("\nExtrato da Frota:");
        System.out.println(frota.emitirExtrato());
    }
}