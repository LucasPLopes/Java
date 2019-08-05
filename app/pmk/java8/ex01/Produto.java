
public class Produto
{
    private int id;
    private String nome;
    private double price;
    private int quantidade;
    private String fabricante;


    public Produto() {
    }

    public Produto(int id, String nome, double price, int quantidade, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.price = price;
        this.quantidade = quantidade;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto [fabricante=" + fabricante + ", id=" + id + ", nome=" + nome + ", price=" + price
                + ", quantidade=" + quantidade + "]";
    }
    
}