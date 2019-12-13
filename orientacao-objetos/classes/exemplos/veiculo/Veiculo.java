package veiculo;

public class Veiculo
{
    private Info informacao;
    private Motor motor;
    private Combustivel combustivel;

    public Veiculo(Info informacao, Motor motor, Combustivel combustivel) {
        this.informacao = informacao;
        this.motor = motor;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo [informacao=" + informacao +", combustivel=" + combustivel +  ", motor=" + motor + "]";
    }
    

}