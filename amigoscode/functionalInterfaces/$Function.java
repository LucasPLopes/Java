package functionalInterfaces;

import java.util.function.Function;
import java.util.function.BiFunction;

public class $Function {

    public static void main(String... args) {

      

        System.out.println(inc(1));
        System.out.println(new $Function().incFI.apply(1));
        System.out.println(incFD.apply(1));
        System.out.println(incFL.apply(1));
        Function<Integer,Integer> fun  = incFIS.andThen(multBy10);
        System.out.println(fun.apply(10));
        System.out.println(add1andMultByN.apply(10, 10));
    }

    static int inc(int n) {
        return n + 1;
    }

   Function<Integer, Integer> incFI = n -> n + 1;
   static Function<Integer,Integer> incFIS = n -> n+ 1;
   static Function<Integer, Double> incFD = n -> 1.0 + n;
   static Function<Integer, Long> incFL = n -> n + 1L;

   static Function<Integer,Integer> multBy10 = n -> n * 10 ;

   static BiFunction<Integer, Integer,Integer> add1andMultByN = (num, mult) -> (num + 1 ) * mult;

    
}