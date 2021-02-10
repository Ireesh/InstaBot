package Services;

import Entity.Order;

import java.sql.SQLException;

public class AcceptOrderForDelivery {
    private Middleware middleware;

    public void setMiddleware (Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean acceptOrder(Order order) throws SQLException {
        if (middleware.check(order)) {
            System.out.println("Your order was accepted!");
            return true;
        } else {
            return false;
        }
    }
}
