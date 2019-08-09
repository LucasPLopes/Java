package src.ŕepository;
import src.model.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Convidados {
	private static final List<Convidado> convidados = new ArrayList<>();
	static {
		convidados.add(new Convidado("Lucas", 5));
		convidados.add(new Convidado("Ana", 3));
		convidados.add(new Convidado("Lis", 7));
	}
	public List<Convidado> todos(){
		return Convidados.convidados;
	}
	public void adicionar(Convidado c) {
		Convidados.convidados.add(c);
	}
}
