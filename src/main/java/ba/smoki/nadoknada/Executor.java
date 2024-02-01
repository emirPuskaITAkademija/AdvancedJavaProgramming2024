package ba.smoki.nadoknada;

//Proces
//MAIN thread

/**
 * Dva načina su tu da startamo threadove u javi.
 * <li>1. Runnable</li>
 * <li>2. Thread</li>
 */
public class Executor {
    public static void main(String[] args) {

        Thread trenutni = Thread.currentThread();
        System.out.println("Hello World ! Rekao je : " + trenutni.getName());
        RunnableRadnik radnik = new RunnableRadnik("Arman");
        //radnik.run();
        new Thread(radnik).start();
        RunnableRadnik radnik2 = new RunnableRadnik("Mile");
        new Thread(radnik2).start();
        //Runnable -> FunctionalInterface
        Runnable radnik3 = () -> pozoviMe();
        //radnik3.run() -> iznad ->
        //radnik3.run();
        new Thread(radnik3).start();

        RadnikThread radnikThread = new RadnikThread();
        radnikThread.run();
    }

    private static void pozoviMe() {
        Thread thread = Thread.currentThread();
        thread.setName("POZVANI");
        String imeThreada = thread.getName();
        System.out.println("Pozvana si ti o funkcijo. Izvršava te: " + imeThreada);
    }
}
