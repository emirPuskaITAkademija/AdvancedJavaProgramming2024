package ba.smoki.seven.concurrency;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        Thread trenutniThread = Thread.currentThread();
        System.out.println(trenutniThread.getName());
    }
}
