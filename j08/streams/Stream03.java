import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream03 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana02");
        names.add("Ana01");
        names.add("Bia01");
        names.add("Ju03");
        names.add("Ju02");

        Optional reduced = names
            .stream()
            .sorted()
            .reduce( (a,b) -> a +"_" + b);

        reduced.ifPresent(System.out::println);

        // Ana01_Ana02_Bia01_Ju02_Ju03
    }
}