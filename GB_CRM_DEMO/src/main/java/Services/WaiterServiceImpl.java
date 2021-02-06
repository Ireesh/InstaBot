package Services;

import Entity.Bill;
import Entity.Cafe;
import Entity.Order;

public class WaiterServiceImpl extends Middleware implements WaiterService {

    @Override
    public boolean check(Order order) {
        if (order.getTimeDelivery() >= Cafe.workingHoursSince && order.getTimeDelivery() <= Cafe.workingHoursTill) {
            return checkNext(order);
        } else {
            return false;
        }
    }
}
