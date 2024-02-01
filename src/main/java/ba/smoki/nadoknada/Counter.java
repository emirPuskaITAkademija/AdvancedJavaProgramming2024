package ba.smoki.nadoknada;

public class Counter {
    private int c = 23;

    public synchronized void increment(){
        c++;
    }

    public synchronized void decrement(){
        c--;
    }

    public synchronized int value(){
        return c;
    }
}
