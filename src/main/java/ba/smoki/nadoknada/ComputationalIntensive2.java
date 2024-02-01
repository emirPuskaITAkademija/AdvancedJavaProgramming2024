package ba.smoki.nadoknada;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

//1. run sekvencijalno(main thread)
//2. run parallel
//3. run in our own ForkJoinPool
public class ComputationalIntensive2 {
    static final int MAX = 2000;

    public static void main(String[] args) throws InterruptedException {
        long time1 = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool(5);
        forkJoinPool.submit(()-> {
            double sum = IntStream.range(0, MAX)
                    .parallel()
                    .mapToDouble(it -> compute(it))
                    .sum();
            System.out.println("SUMA = " + sum);
        });
        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(25, TimeUnit.SECONDS);
        long time2 = System.currentTimeMillis();
        long sekunde = (time2-time1)/1000;
        System.out.println("Broj sekundi = " + sekunde);
    }

    static double compute(double number){
        System.out.println(Thread.currentThread().getName());
        double result = 0;
        for(int i = 0; i<MAX; i++){
            for(int j = 0; j<MAX; j++){
                result = result+Math.sqrt(i*j);
            }
        }
        return result;
    }
}
