package animais.util;
import animais.Animal;

public class Util{
    private static String info = "Meu pet é o %s que é uma espécie %s\n";

    public static void informacaoAnimal(Animal romeu) {
    	
        System.out.println(String.format(info,romeu.getNome(), romeu.getRaca()));
    }
}