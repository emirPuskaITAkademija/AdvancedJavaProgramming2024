package ba.smoki.three;

import ba.smoki.three.product.Product;
import ba.smoki.three.product.ProductDao;

public class Demo2 {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        for(Product product: productDao.selectAll()){
            System.out.println(product);
        }
    }
}
