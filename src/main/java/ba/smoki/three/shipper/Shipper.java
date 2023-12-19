package ba.smoki.three.shipper;

import java.util.Objects;

public class Shipper {
    private Long shipperId;
    private String name;

    public Shipper() {
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "shipperId=" + shipperId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipper shipper = (Shipper) o;
        return Objects.equals(shipperId, shipper.shipperId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipperId);
    }
}
