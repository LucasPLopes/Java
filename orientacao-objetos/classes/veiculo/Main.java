public class Main{
    public static void main(String[] args) {
        Info informacao = new Info("Nightly runner", "Tesla", 2022);
        Motor motor = Motor.V8T;
        Combustivel combustivel = Combustivel.HIBRIDO;

        Veiculo veiculo = new Veiculo(informacao, motor, combustivel);

        
        System.out.println(veiculo);

    }
}