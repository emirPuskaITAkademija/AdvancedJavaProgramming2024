package ba.smoki.three.product;

import ba.smoki.three.ConnectionPool;
import ba.smoki.three.Dao;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product> {
    @Override
    public void save(Product product) {

    }

    @Override
    public Product select(long id) {
        return null;
    }

    @Override
    public List<Product> selectAll() {
        List<Product> products = new ArrayList<>();
        // 1.0, 1.1 ---1.6  try-catch-finally
        try{
            ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
            //1. Connection
            Connection connection = connectionPool.getConnection();
            //2. Statement (SELECT * FROM products)
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
            //3. ResultSet
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Long productId = resultSet.getLong("product_id");
                String name = resultSet.getString("name");
                Integer quantityInStock = resultSet.getInt("quantity_in_stock");
                BigDecimal unitPrice = resultSet.getBigDecimal("unit_price");

                Product product = new Product();
                product.setProductId(productId);
                product.setName(name);
                product.setQuantityInStock(quantityInStock);
                product.setUnitPrice(unitPrice);

                products.add(product);
            }

            connectionPool.releaseConnection(connection);
        }catch (SQLException exception){
            System.err.println(exception.getMessage());
        }
        Product product = new Product();
        product.setProductId(1L);
        product.setName("Foam Dinner Plate");
        product.setQuantityInStock(70);
        product.setUnitPrice(BigDecimal.valueOf(1.21));
        products.add(product);
        products.add(product);
        products.add(product);
        return products;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product t) {

    }
}
