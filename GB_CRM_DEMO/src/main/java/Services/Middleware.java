package Services;

import Entity.Order;
import Entity.Product;

import java.sql.SQLException;
import java.util.List;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(Order order) throws SQLException;

    protected boolean checkNext(Order order) throws SQLException {
        if (next == null) {
            return true;
        }
        return next.check(order);
    }

}
