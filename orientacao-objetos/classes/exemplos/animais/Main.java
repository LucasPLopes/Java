package animais;

import animais.Raca;
import animais.util.Util;
// Com o import static as nossas declarações seram chamadas assim
// metodo() e sem o static é Util.metodo()

public class Main {
	public static void main(String[] args) {
		Animal romeu = new Animal("Romeu Lopes", 4, Raca.CANINA);
		Util.informacaoAnimal(romeu);

	}

}