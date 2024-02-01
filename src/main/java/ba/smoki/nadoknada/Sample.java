package ba.smoki.nadoknada;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//SUMA: 3265062
public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 23, 2, 34, 343, 32232, 2, 4, 5, 124, 232, 323, 3232332);
        int sumaParnih = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 == 0) {
                sumaParnih = sumaParnih + number;
            }
        }
        System.out.println(sumaParnih);
        //Martin Fowler
        //Elegance - performance
        BinaryOperator<Integer> binaryOperator = (n1, n2) -> {
            int result = n1 + n2;
            return result;
        };
        int sumaParnih2 = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (br1, br2) -> br1 + br2);
        int sumaParnih3 = numbers
                .stream()
                .filter(it -> it % 2 == 0)
                .mapToInt(it -> it)
                .sum();
        System.out.println(sumaParnih2);
    }

    //    nekaFunkcija(23);
//    nekaFunkcija(23, 3453, 456);
//    nekaFunkcija();
    static void nekaFunkcija(Integer... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
