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


}
