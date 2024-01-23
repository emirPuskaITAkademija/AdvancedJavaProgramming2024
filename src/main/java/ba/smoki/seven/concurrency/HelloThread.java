package ba.smoki.seven.concurrency;

public class HelloThread extends Thread{
    @Override
    public void run() {
        System.out.println("Pozdrav od: " + Thread.currentThread().getName());
    }
}
