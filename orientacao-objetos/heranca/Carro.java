public class Carro extends Veiculo {
    public final int LIMITE_DE_VELOCIDADE = 330;
    private int velocidade = 180;

    @Override
    public String correr() {
        return String.format("id: %d,%s do fabrincante %s está correndo a %d km/h",
                             id,modelo, fabricante, velocidade);

    }
    public String turbo(){
        return String.format("%s ativou o turbo",
                             modelo);

    }

    public Carro() {
        super();
    }

    public Carro(String modelo, String fabricante) {
        super(modelo, fabricante);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) throws Exception {
        if (velocidade > LIMITE_DE_VELOCIDADE)
            throw new Exception("Velocidade acima do permitido por Carro");
        this.velocidade = velocidade;
    }

}