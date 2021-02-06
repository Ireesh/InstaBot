package Services;

import Entity.Order;

public class AcceptOrderForDelivery {
    private Middleware middleware;

    public void setMiddleware (Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean acceptOrder(Order order) {
        if (middleware.check(order)) {
            System.out.println("Your order was accepted!");
            return true;
        } else {
            return false;
        }
    }
}
