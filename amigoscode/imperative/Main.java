package imperative;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main{
    private static Gender gender = FEMALE;
    private static Predicate<? super Person> predicate = p ->  gender.equals(p.getGender());

    public static void main(String[] args) {
        List<Person> people = List.of(
        new Person("Lucas",MALE),
        new Person("Ana", FEMALE),
        new Person("Maria", FEMALE),
        new Person("Flávia",FEMALE)
        );

        List<Person> females = new ArrayList<>();

        for(Person p :people)
            if(FEMALE.equals(p.getGender()))
                females.add(p);
        
        females.forEach(System.out::println);

        Predicate<Person> predicate2 = p -> FEMALE.equals(p.getGender()); 
        Comparator<Person> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        List<Person> functionalFemales = people.stream()
            .filter( predicate2)
            .sorted( comparator)
            .collect(Collectors.toList());
        
        functionalFemales.forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String n,Gender g){
            name = n;
            gender = g;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person [gender=" + gender + ", name=" + name + "]";
        }
        
    }

    enum Gender{
        MALE,FEMALE;
    }
}