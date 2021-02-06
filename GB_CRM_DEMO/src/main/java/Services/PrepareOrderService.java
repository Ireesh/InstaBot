package Services;

import Entity.Bill;
import Entity.Order;

import java.util.Date;

public interface PrepareOrderService {
    void sendOrderForAll(Order order, Bill bill, Date date, String address);
}
