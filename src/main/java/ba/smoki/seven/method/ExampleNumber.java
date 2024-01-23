package ba.smoki.seven.method;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExampleNumber {
    public static void main(String[] args) {
        //reducirali sve ove brojeve na JEDAN MAGIČNI BROJ zvani SUMA
        List<BigDecimal> numbers = Arrays.asList(
                new BigDecimal("23.45"),
                new BigDecimal("23355.45"),
                new BigDecimal("12123.45"),
                new BigDecimal("232323.45"),
                new BigDecimal("121223.45"),
                new BigDecimal("123123.45"),
                new BigDecimal("5823.45"),
                new BigDecimal("23.00"));
//        BigDecimal suma = BigDecimal.ZERO;
//        for(BigDecimal number : numbers){
//            suma = suma.add(number);
//        }
        BinaryOperator<BigDecimal> binaryOperator = (op1,op2)->op1.add(op2);
        BigDecimal suma = numbers.stream().reduce(BigDecimal.ZERO, binaryOperator);
        System.out.println(suma);
    }
}
