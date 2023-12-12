package ba.smoki.one.human;

/**
 * Relacija naslijeđivanja:
 * Is an employee a person ?
 * Ist Arbeiter einen Personnen ?
 * Da li je uposlenik osoba ?
 */
public class Employee extends Person {
    private double salaryAmount;


    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
