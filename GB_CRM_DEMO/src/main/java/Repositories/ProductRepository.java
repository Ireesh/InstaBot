package Repositories;

import Entity.*;

import java.sql.*;
import java.util.Locale;

public class ProductRepository {
    String url = "jdbc:mysql://localhost:3306/gb_shop?useSSL=false";
    String user = "root";
    String password = "1Qwe2Asd3Zxc";

    private Connection connection;

    public ProductRepository() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Product findByType(String productType) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM products WHERE `type` = ?");
        statement.setString(1, productType);
        try (ResultSet result = statement.executeQuery()) {
            while (result.next()) {
                Product product = new Product();
                product.setId(result.getLong(1));
                product.setName(result.getString(2));
                product.setPrice(result.getDouble(3));
                product.setAmount(result.getDouble(4));
                product.setWeight(result.getDouble(5));
                return product;
            }
        }
        return null;
    }

}
