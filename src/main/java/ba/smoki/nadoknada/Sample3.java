package ba.smoki.nadoknada;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * PARALLEL:
 * Kolko trebam Threadova kreirati:
 * <li>1. COMPUTATIONAL INTENSIVE</li>
 *   broj_threadova =   1 / (1-BLOCKING_FACTOR)     * procesora
 *   0<BLOCKING_FACTOR<=1
 * <li>2. IO intensive</li>
 *
 */
public class Sample3 {
    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Procesori: " + processors);

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
