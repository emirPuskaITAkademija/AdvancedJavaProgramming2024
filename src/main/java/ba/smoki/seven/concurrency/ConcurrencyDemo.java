package ba.smoki.seven.concurrency;

/**
 * Postoje dvije osnovne jedinice:
 * <li>1. PROCES</li>
 * <li>2. THREAD ili programska nit</li>
 *
 * <p>
 *     PROCES: posjeduje vlastito okruženje za izvršavanje i
 *     posjeduje i privatan set vlastitih resursa za izvršavanje.
 *     JVM programa se izvršava u okviru jednog procesa
 * </p>
 * <p>
 *     THREADS ili NITI: lagani proces
 *     self-execution environment i memory space
 * </p>
 *
 */
public class ConcurrencyDemo {
    public static void main(String[] args) {
        //Proces-1 Thread
        Thread thread = Thread.currentThread();
        //1. način
        Runnable runnable = new MyRunnable();
        new Thread(runnable).start();//run()
        //2. mačin
        new HelloThread().start();//run()
        System.out.println(thread.getName());
    }
}
