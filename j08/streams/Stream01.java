import java.util.ArrayList;
import java.util.List;

public class Stream01 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana02");
        names.add("Ana01");
        names.add("Bia01");

        names.stream()
            .sorted()
            .forEach(System.out::println);


        /**
         *  OUTPUT:
         *  Ana01
         *  Ana02
         *  Bia01
         */

        System.out.println(names);
        /**
         * [Ana02, Ana01, Bia01]
         */
    }

}