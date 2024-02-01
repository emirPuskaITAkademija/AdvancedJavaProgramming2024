package ba.smoki.nadoknada.singleton;

/**
 * CILJ: Osigurati da postoji samo JEDAN PRIMJERAK/VARIJABLA/OBJEKAT/INSTANCA
 * <p>
 *     Kako postići navedeno ???
 *     1. privatni konstruktor
 *     2. pristup toj instanci preko static metode
 * </p>
 */
public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton(){
        System.out.println("Kreiran je Singleton...");
    }

    public static Singleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
