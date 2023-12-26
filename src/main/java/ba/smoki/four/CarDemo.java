package ba.smoki.four;

import java.time.LocalDate;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("CRNA");
        car.setBrojSasije("12mkdmskfms");
        car.setModel("S3");
        car.setProductionYear(LocalDate.now());

        Car car2 = new Car()
                .setColor("BIJELA")
                .setBrojSasije("smkamkams")
                .setModel("A8")
                .setProductionYear(LocalDate.now());
    }
}
