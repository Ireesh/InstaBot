package Services;

import Entity.Order;
import Entity.Product;
import Repositories.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl extends Middleware implements ProductService {
    ProductRepository productRepository;

    public void ProductServiceImpl (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean check(Order order) throws SQLException {
        for (Product p : order.getAllProducts()) {
            if (productRepository.findByType(p.getName()) == null) { return false; }
        }
        return checkNext(order);
    }

}
