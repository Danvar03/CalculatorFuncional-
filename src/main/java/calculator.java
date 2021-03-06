
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;


public class calculator {

    static IntBinaryOperator suma = (a, b) -> a + b;
    static IntBinaryOperator resta = (a, b) -> a - b;
    static IntBinaryOperator mult = (a, b)-> {
        if (b < 0 && a > 0){
            int c = a;
            a=b;
            b=c;
        }
        if (b < 0 && a < 0){
            a =-a;
        }
        int finalA = a;
        return IntStream.range(0, Math.abs(b) + 1)
                .reduce((acumalated, number) -> suma
                        .applyAsInt(finalA, acumalated))
                .getAsInt();


    };
    static IntBinaryOperator div = (a,b) -> {
       return IntStream.range(0,Math.abs(a) )
                .reduce((acumulador, numero) ->
                        mult.applyAsInt(numero, b) <= a ? suma.applyAsInt(acumulador, 1) : acumulador).getAsInt();

    };


    public static void main(String[] args) {
        System.out.println("__________ Calculadora con PF __________");
        System.out.println(suma.applyAsInt(3, 2));
        System.out.println(resta.applyAsInt(3, 2));
        System.out.println(mult.applyAsInt(-5, -10));
        System.out.println(div.applyAsInt(-50,2));
    }

}
