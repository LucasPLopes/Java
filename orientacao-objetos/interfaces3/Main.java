import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        SuperHeroi p2 = new SuperHeroi();
        Pessoa p3 = new SuperHeroi();
        SuperHeroi p4 = new SuperHeroi();
        // SuperHeroi p5 = new Pessoa(); error não podemos converter uma classe Mãe em
        // classe Filha

        p1.setAno(1996);
        p2.setAno(1995);
        p3.setAno(1997);
        p4.setAno(1990);

        lista.add(p1);
        lista.addAll(Arrays.asList(p2, p3, p4));

        if (p1.compareTo(p2) == -1)
            System.out.println("P1 chegou primeiro");
        else if (p1.compareTo(p2) == 1)
            System.out.println("P2 chegou primeiro");
        else
            System.out.println("Ambos chegaram");

        lista.stream()//
                .sorted()//
                .forEach(System.out::println);


       Optional<Pessoa> first = lista.stream().sorted().findFirst();

       System.out.println("\n\nPrimeiro a chegar foi em ");
        first.ifPresent(System.out::println);
    }
}
