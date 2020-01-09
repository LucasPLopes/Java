public class Main {
    public static void main(String[] args) {

        // Veiculo v = new Veiculo() não podemos instanciar classes abstratas e também
        // temos
        // que implementar o método correr()

        Carro refEclipse, meuEclipse = new Carro("Eclipse EVO", "Mitsubishi");
        Carro meuCity = new Carro("City", "Honda");

        try {
            meuEclipse.setVelocidade(240);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Veiculo refJeep, meuJeep = new Carro("Cherokee", "Jeep");
        // meuJeep.setVelocidade(100); não consigo pois a referencia é para Veiculo e
        // não do tipo Carro
        // veiculo não conhece velocidade, solução é deixar um valor default

        VeiculoRepository.add(meuEclipse);
        VeiculoRepository.add(meuJeep);
        VeiculoRepository.add(new Carro("City", "Honda"));

        refEclipse = (Carro) VeiculoRepository.get(0);
        refJeep = VeiculoRepository.get(1);

        if (refEclipse.equals(meuEclipse))
            System.out.println("refEclipse e meuEclipse apontam para o mesmo objeto");
        else
            System.out.println("refEclipse e meuEclipse apontam para objetos diferentes");

        if (meuCity.equals((Carro) VeiculoRepository.get(2)))
            System.out.println("meuCity e VeiculoRepository.get(2) apontam para o mesmo objeto");
        else
            System.out.println("meuCity e VeiculoRepository.get(2) apontam para objetos diferentes");

        System.out.println(refEclipse.correr());
        System.out.println(refEclipse.turbo());
        System.out.println(refJeep.correr());
        System.out.println("Veiculo Repository:: " + VeiculoRepository.get(2).correr());
        System.out.println("Meu City:: " + meuCity.correr());
        System.out.println("Meu City:: " + meuCity.turbo());
        // System.out.println(meuJeep.turbo());

    }
}