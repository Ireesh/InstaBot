package Services;

import Entity.Bill;
import Entity.Order;

import java.util.Date;

public class PrepareOrderServiceImpl {
    private DeliveryServiceImpl deliveryService;
    private WaiterServiceImpl waiterService;
    private KitchenServiceImpl kitchenService;

    public PrepareOrderServiceImpl() {
        deliveryService = new DeliveryServiceImpl();
        waiterService = new WaiterServiceImpl();
        kitchenService = new KitchenServiceImpl();
    }

    public void sendOrderForAll(Order order, Bill bill, Date date, String address) {
        deliveryService.sendOrderForPreparation(bill, date, address);
        waiterService.sendOrderForPreparation(bill);
        kitchenService.sendOrderForPreparation(order.toString());
    }
}
