package ba.smoki.nadoknada;

import java.util.Arrays;
import java.util.List;

/**
 * -> Struktura sekvencijalnog koda je ista kao struktura parallel
 * -> Nije postojao MASTER SWITCH
 * <li>1. Predicate</li>
 * <li>2. Supplier </li>
 * <li>3. Consumer</li>
 * <li>4. Function </li>
 */
public class Sample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 23, 2, 34, 343, 32232, 2, 4, 5, 124, 232, 323, 3232332);
        numbers
                .stream()
                .parallel()
                .filter(Sample2::isEven)
                .map(Sample2::transform)
                .forEach(Sample2::printIt);
    }

    static boolean isEven(Integer number) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + "  provjerava dal je broj paran");
        return number % 2 == 0;
    }

    static Integer transform(Integer number) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + " transformise broj " + number);
        return number * 2;
    }

    static void printIt(Integer number) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + " printa broj " + number);
    }
}
