public class Abastecimento{

    private String data;
    private Integer km;
    private Double valor;
    private Double volume;

    public Abastecimento(String data, Integer km, Double valor, Double volume){
        this.data = data;
        this.km = km;
        this.valor = valor;
        this.volume = volume;
    }

    public String getData(){
        return data;
    }

    public Integer getKm(){
        return km;
    }

    public Double getVolume(){
        return volume;
    }

    public Double getValor(){
        return valor;
    }

}