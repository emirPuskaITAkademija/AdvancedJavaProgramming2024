package ba.smoki.nadoknada;

public class RadnikThread extends Thread {

    @Override
    public void run() {
        Thread radnik = Thread.currentThread();
        radnik.setName("THREAD RADNIK");
        System.out.println("Pozdrav od mene isto. Ja izvršavam ovu liniju koda i zovem se : " + radnik.getName());
    }
}
