import Entity.*;
import Services.PrepareOrderServiceImpl;

import java.util.Date;

public class Launcher {
    public static void main(String[] args) {
        PrepareOrderServiceImpl prepareOrderService = new PrepareOrderServiceImpl();
        //set parameters for user
        User user = new User();
        Date date = new Date();
        date.getTime();
        //set parameters for order
        Rapanas rapanas = new Rapanas(RapanasType.ORIGINAL);
        Vegetable vegetable = new Vegetable();
        Salmon salmon = new Salmon();
        Salad salad = new Salad(SaladType.CEASAR);
        Beverage beverage = new Beverage(BeverageType.COLA);

        //create order
        OrderBuilder orderBuilder = new OrderBuilder();
        OrderBillBuilder orderBillBuilder = new OrderBillBuilder();

        orderBuilder.addRapanas(rapanas);
        orderBuilder.addExtraRapanasVegetable(vegetable);
        orderBuilder.addSalad(salad);
        orderBuilder.addExtraSaladSalmon(salmon);
        orderBuilder.addBeverage(beverage);

        orderBillBuilder.addRapanas(rapanas);
        orderBillBuilder.addExtraRapanasVegetable(vegetable);
        orderBillBuilder.addSalad(salad);
        orderBillBuilder.addExtraSaladSalmon(salmon);
        orderBillBuilder.addBeverage(beverage);

        //send order info for departments
        prepareOrderService.sendOrderForAll(orderBuilder.getResult(), orderBillBuilder.getResult(), date, user.getAddress());
    }
}
