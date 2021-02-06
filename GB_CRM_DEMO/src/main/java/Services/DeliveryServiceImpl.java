package Services;

import Entity.Order;
import Repositories.DeliveryRepository;

public class DeliveryServiceImpl extends Middleware implements DeliveryService{
   DeliveryRepository deliveryRepository = new DeliveryRepository();

    @Override
    public boolean check(Order order) {
        for (String street : deliveryRepository.getAvailableStreets()) {
            if (street == order.getAddress().getStreet()) { return checkNext(order); }
        }
        return false;
    }
}
