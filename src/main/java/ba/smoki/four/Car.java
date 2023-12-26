package ba.smoki.four;

import java.time.LocalDate;

public class Car {
    private String brojSasije;
    private String model;
    private String color;
    private LocalDate productionYear;

    public String getBrojSasije() {
        return brojSasije;
    }

    public Car setBrojSasije(String brojSasije) {
        this.brojSasije = brojSasije;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public Car setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
        return this;
    }
}
