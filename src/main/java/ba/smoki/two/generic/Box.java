package ba.smoki.two.generic;
/*

 U - bounded
 V, Z - unbounded
 */
public class Box<U extends Number, V, Z>{

    private U ultra;
    private V violentno;
    private Z zracenje;

    public Box() {
    }

    public U getUltra() {
        return ultra;
    }

    public void setUltra(U ultra) {
        this.ultra = ultra;
    }

    public V getViolentno() {
        return violentno;
    }

    public void setViolentno(V violentno) {
        this.violentno = violentno;
    }

    public Z getZracenje() {
        return zracenje;
    }

    public void setZracenje(Z zracenje) {
        this.zracenje = zracenje;
    }
}
