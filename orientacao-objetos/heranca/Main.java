public class Main {
    public static void main(String[] args) {
        
        // Veiculo v = new Veiculo()  não podemos instanciar classes abstratas e também temos 
        // que implementar o método correr()

        Carro  meuEclipse = new Carro("Eclipse EVO", "Mitsubishi");
        
        try {
            meuEclipse.setVelocidade(240);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Veiculo meuJeep = new Carro("Cherokee", "Jeep");
        // meuJeep.setVelocidade(100); não consigo pois a referencia é para Veiculo e não do tipo Carro
        // veiculo não conhece velocidade, solução é deixar um valor default
        
        

        System.out.println(meuEclipse.correr());
        System.out.println(meuEclipse.turbo());
        System.out.println(meuJeep.correr());
        // System.out.println(meuJeep.turbo());



    }
}