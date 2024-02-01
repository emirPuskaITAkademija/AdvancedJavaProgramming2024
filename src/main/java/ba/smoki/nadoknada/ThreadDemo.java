package ba.smoki.nadoknada;

/**
 * JOIN ->
 */
public class ThreadDemo {


    public static void main(String[] args) throws InterruptedException {
        String[] poruke = {
                "Dan je bio sunčan i lijep",
                "Zagađenja nije bilo ili ga je bilo vrlo malo",
                "Nakon dugo vremena smo vidjeli sunce",
                "Onda smo došli na Java Desktop App Dev misleć da ćemo raditi GUI",
                "Na žalost ostalo je još malo dosadne Advanced Jave"
        };
        for(String poruka: poruke){
            Thread.sleep(4000);
            System.out.println(poruka);
        }
    }
}
