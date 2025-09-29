import java.util.ArrayList;
import java.util.List;

public class Veiculo{
    
    private String placa;
    private String modelo;
    private List<Abastecimento> abastecimentos;
 
    public Veiculo(String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
        this.abastecimentos = new ArrayList<>();
    }

    public void abastecer(String data, Integer km, Double valor, Double volume){
        abastecimentos.add(new Abastecimento(data, km, valor, volume));
    }

    public String getDataUltimoAbastecimento(){
        if (abastecimentos.isEmpty()) return "Nenhum abastecimento";
        return abastecimentos.get(abastecimentos.size() - 1).getData();
    }

    public String getKmAtual(){
        if (abastecimentos.isEmpty()) return "0";
        return abastecimentos.get(abastecimentos.size() - 1).getKm().toString();
    }

    public Double getConsumoTotal(){
        double total = 0;
        for (Abastecimento abastecimento : abastecimentos){
            total += abastecimento.getVolume();
        }
        return total;
    }

    public Double getGastoTotal(){
        double total = 0;
        for (Abastecimento abastecimento : abastecimentos){
            total += abastecimento.getValor();
        }
        return total;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }
}
