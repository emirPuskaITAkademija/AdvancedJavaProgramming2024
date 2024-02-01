package ba.smoki.nadoknada;

public class RunnableRadnik implements Runnable{
    private final String name;

    public RunnableRadnik(String name){
        this.name = name;
    }

    @Override
    public void run() {
        Thread radnik = Thread.currentThread();
        radnik.setName(name);
        System.out.println("Pozdrav i od mene radnika: " + radnik.getName());
    }
}
