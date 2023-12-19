package ba.smoki.three.product;

import java.math.BigDecimal;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private Long productId;
    private String name;
    private Integer quantityInStock;
    private BigDecimal unitPrice;

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return name + " [ " + productId + " ]";
    }

    /**
     * Product p = new Product()
     * p.equals(animal)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return productId == product.getProductId() && name.equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name);
    }

    /**
     * 0 -> p1 jednak p2
     * -1 -> p1 manji od p2
     * 1 -> p1 veći od p2
     *
     * @param o the object to be compared.
     * @return result
     */
    @Override
    public int compareTo(Product o) {

        return productId.compareTo(o.getProductId());
    }
}
