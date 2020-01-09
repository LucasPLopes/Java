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
        
        


        VeiculoRepository.add(meuEclipse);
        VeiculoRepository.add(meuJeep);

        System.out.println(VeiculoRepository.get(0).correr());
        System.out.println(((Carro) VeiculoRepository.get(0)).turbo());
        System.out.println(VeiculoRepository.get(1).correr());
        // System.out.println(meuJeep.turbo());



    }
}