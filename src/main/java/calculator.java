import java.util.function.BiFunction;


public class calculator {


    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> resta = (a, b) -> a - b;

        System.out.println(suma.apply(5, 2));
        System.out.println(resta.apply(5, 2));


    }
}
