package ba.smoki.one;

/**
 * Osim statičkih polja, funkcija interfejs ne može
 * imati instancna polja ili funkcije koje nisu apstraktne osim
 * ako nisu default(Java 8).
 *
 * <p>
 * FUNKCIONALNI INTERFEJS:
 * Potreban i dovoljan uslov da interfejs bude funkcionalni jeste
 * da ima jednu i samo jednu apstraktnu metodu.
 * </p>
 */
public interface Flyable {
    void fly();
}
