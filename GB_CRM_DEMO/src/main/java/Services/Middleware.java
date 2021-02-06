package Services;

import Entity.Order;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(Order order);

    protected boolean checkNext(Order order) {
        if (next == null) {
            return true;
        }
        return next.check(order);
    }
}
