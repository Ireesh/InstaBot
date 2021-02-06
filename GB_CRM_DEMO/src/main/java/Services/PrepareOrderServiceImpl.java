package Services;

import Entity.Bill;
import Entity.Order;
import Entity.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrepareOrderServiceImpl implements PrepareOrderService{
    private DeliveryServiceImpl deliveryService;
    private WaiterServiceImpl waiterService;
    private KitchenServiceImpl kitchenService;
    private ProductServiceImpl productService;

    public PrepareOrderServiceImpl() {
        deliveryService = new DeliveryServiceImpl();
        waiterService = new WaiterServiceImpl();
        kitchenService = new KitchenServiceImpl();
        productService = new ProductServiceImpl();
    }

    public void sendOrderForAll(Order order, Bill bill, Date date, String address) {
        if (productService.checkAvailability(order.getAllProducts())) {
            deliveryService.sendOrderForPreparation(bill, date, address);
            waiterService.sendOrderForPreparation(bill);
            kitchenService.sendOrderForPreparation(order.toString());
        }
    }

}
