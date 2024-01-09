package ba.smoki.three;

import ba.smoki.three.product.Container;
import ba.smoki.three.product.Product;
import ba.smoki.three.product.ProductDao;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        List<Product> products = productDao.selectAll();
        Container<Product> productContainer = new Container<>();
        for(Product product: productContainer){
            System.out.println(product);
        }
    }
}
