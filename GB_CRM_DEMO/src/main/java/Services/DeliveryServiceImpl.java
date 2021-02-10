package Services;

import Entity.Order;
import Repositories.DeliveryRepository;

import java.sql.SQLException;

public class DeliveryServiceImpl extends Middleware implements DeliveryService{
   DeliveryRepository deliveryRepository = new DeliveryRepository();

    @Override
    public boolean check(Order order) throws SQLException {
        for (String street : deliveryRepository.getAvailableStreets()) {
            if (street == order.getAddress().getStreet()) { return checkNext(order); }
        }
        return false;
    }
}
