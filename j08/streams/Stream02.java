import java.util.ArrayList;
import java.util.List;

public class Stream02 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana02");
        names.add("Ana01");
        names.add("Bia01");
        names.add("Ju03");
        names.add("Ju02");


        names.stream()
        .filter( n -> n.startsWith("J"))
        .sorted()
        .forEach(System.out::println);

        /**
         *  Ju02
         *  Ju03
         *
        */

        System.out.println("");
        names.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

        /**
         * ANA02
         * ANA01
         * BIA01
         * JU03
         * JU02
        */

        names.stream()
            .map(String::toUpperCase)
            .sorted((a,b)-> a.compareTo(b))
            .forEach(System.out::println);
        
          /**
         * ANA01
         * ANA02
         * BIA01
         * JU02
         * JU03
        */

        boolean anyStartsWithA = false;
            anyStartsWithA = names
                .stream()
                .anyMatch( n -> n.toUpperCase().startsWith("A"));
        System.out.println("\nAny starts with 'A' ? "+ anyStartsWithA); // true
        
        boolean allStartsWithA =true ;
            allStartsWithA = names
                .stream()
                .allMatch(n -> n.toUpperCase().startsWith("a"));
        System.out.println("\nAll starts with 'A' ? "+ allStartsWithA); // false
        
        boolean noneStartsWithZ =true ;
        noneStartsWithZ = names
            .stream()
            .noneMatch(n -> n.toUpperCase().startsWith("z"));    
        System.out.println("\nNone starts with 'Z' ? "+ noneStartsWithZ);

        Long size = 0L;
        size = names
            .stream()
            .count();
        System.out.println("Total of names= "+ size);


    }

}