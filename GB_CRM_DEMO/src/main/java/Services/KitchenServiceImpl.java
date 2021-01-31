package Services;

import Entity.Order;

public class KitchenServiceImpl {
    public void sendOrderForPreparation(String order){
        System.out.println("\nKitchen response: the kitchen began to prepare the order\n" + order);
    }
}
