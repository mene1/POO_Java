import java.util.HashMap;
import java.util.Map;

public class Frota{
    private Map<String, Veiculo> veiculos;

    public Frota(){
        this.veiculos = new HashMap<>();
    }

    public Boolean cadastrarVeiculo(String placa, String modelo){
        if (veiculos.containsKey(placa)) {
            return false; // placa já existe
        }
        veiculos.put(placa, new Veiculo(placa, modelo));
        return true;
    }

    public Boolean registraAbastecimento(String placa, String data, Integer km, Double valor, Double volume){
        Veiculo veiculo = veiculos.get(placa);
        if (veiculo == null){
            return false; // veiculo nao encontrado
        }
        veiculo.abastecer(data, km, valor, volume);
        return true;
    }

    public Double emitirConsumoTotal(){
        double total = 0;
        for (Veiculo veiculo : veiculos.values()){
            total += veiculo.getConsumoTotal();
        }
        return total;
    }

    public Double emitirGastoTotal(){
        double total = 0;
        for (Veiculo veiculo : veiculos.values()){
            total += veiculo.getGastoTotal();
        }
        return total;
    }
 
    public String emitirExtrato(){
        StringBuilder extrato = new StringBuilder();
        for (Veiculo veiculo : veiculos.values()){
            extrato.append("\n- Placa: ").append(veiculo.getPlaca())
                   .append("\n- Modelo: ").append(veiculo.getModelo())
                   .append("\n- Km Atual: ").append(veiculo.getKmAtual())
                   .append("\n- Data do Último Abastecimento: ").append(veiculo.getDataUltimoAbastecimento())
                   .append("\n");
        }
        return extrato.toString();
    }
}