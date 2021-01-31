package Services;

import Entity.Bill;

public class WaiterServiceImpl {
    public void sendOrderForPreparation(Bill bill){
        System.out.println("\nWaiter response:\n Bill is ready. Prepare setup for the order.\nBill:\n" + bill.print());
    }
}
