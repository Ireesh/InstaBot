import Entity.*;
import Repositories.ProductRepository;
import Services.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLException;
import java.util.Date;

public class Launcher {

    //init Chain of responsibility
    private  static AcceptOrderForDelivery acceptOrderForDelivery = new AcceptOrderForDelivery();
    private static void init() {
        Middleware middleware = new WaiterServiceImpl();
        middleware.linkWith(new DeliveryServiceImpl()).linkWith(new ProductServiceImpl());
        acceptOrderForDelivery.setMiddleware(middleware);
    }

    public static void main(String[] args) {
        //set parameters for user
        User user = new User();
        Date date = new Date();
        date.getTime();
        //set parameters for order
        Rapanas rapanas = new Rapanas(RapanasType.ORIGINAL);
        Vegetable vegetable = new Vegetable(VegetableType.ONION);
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

        ProductRepository productRepository = new ProductRepository();
        try {
            System.out.println(productRepository.findByType("chicken").getName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
