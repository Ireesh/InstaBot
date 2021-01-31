package Services;

import Entity.Bill;
import Entity.Order;

import java.util.Date;

public class DeliveryServiceImpl {
    public void sendOrderForPreparation(Bill bill, Date date, String address){
        System.out.println("\nDelivery response: \n" + date.toString() + "\n" + address + "\n" + bill.print());
    }
}
