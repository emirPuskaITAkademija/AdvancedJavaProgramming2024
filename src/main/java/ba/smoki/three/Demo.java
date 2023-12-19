package ba.smoki.three;

import ba.smoki.three.product.*;
import ba.smoki.three.shipper.Shipper;
import ba.smoki.three.shipper.ShipperDao;

import java.util.*;

/**
 * Klase, apstraktne klase, interfejse
 * <p>
 * interfejs -> specijalni interfejs: FUNKCIONALNI -> LAMBDA
 * </p>
 * <p>
 * Funkcionalni interfejs
 * </p>
 */
public class Demo {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        //products : List, Collection, Iterable
        List<Product> products = productDao.selectAll();
        //Java 1.7
        Container<Product> container = new Container<>();
        for(Product product: container){

        }
        // Razlika između List<E> i Set<E>
        /**
         * 1. Indeksiran pristup
         * 2. Prima duplikate
         * 3. Pamti redoslijed elemenata
         */
        Set<Product> productSet = new HashSet<>(products);
        productSet = new LinkedHashSet<>(products);
        productSet = new TreeSet<>(products);
//        for(Product product: productSet){
//            System.out.println(product);
//        }

        ShipperDao shipperDao = new ShipperDao();
        for(Shipper shipper : shipperDao.selectAll()){
            System.out.println(shipper);
        }

    }

    private static class ProductConsumerImpl implements ProductConsumer {

        @Override
        public void accept(Product product) {
            System.out.println(product);
        }
    }
}
