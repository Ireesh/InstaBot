package Repositories;

import Entity.Product;

import java.util.HashMap;
import java.util.Map;



public class IdentityMap {
    private static Map<String, Product> productMap = new HashMap();

    public static void addProduct(Product product) {
       productMap.put(product.getType(), product);
    }

    public static Product getProduct(String type) {
        return productMap.get(type);
    }
}
