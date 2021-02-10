package Services;

import Entity.Bill;
import Entity.Cafe;
import Entity.Order;

import java.sql.SQLException;

public class WaiterServiceImpl extends Middleware implements WaiterService {

    @Override
    public boolean check(Order order) throws SQLException {
        if (order.getTimeDelivery() >= Cafe.workingHoursSince && order.getTimeDelivery() <= Cafe.workingHoursTill) {
            return checkNext(order);
        } else {
            return false;
        }
    }
}
