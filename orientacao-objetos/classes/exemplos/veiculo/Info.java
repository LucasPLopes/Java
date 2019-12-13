package veiculo;
public class Info{
    private String modelo;
    private String fabricante;
    private Integer ano;

    public Info(String modelo, String fabricante, Integer ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Info [ano=" + ano + ", fabricante=" + fabricante + ", modelo=" + modelo + "]";
    }
    
    
}