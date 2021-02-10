import Entity.*;
import Repositories.IdentityMap;
import Repositories.ProductRepository;
import Services.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;

public class Launcher {

    //init Chain of responsibility
    private  static AcceptOrderForDelivery acceptOrderForDelivery = new AcceptOrderForDelivery();
    private static void init() {
        Middleware middleware = new WaiterServiceImpl();
        middleware.linkWith(new DeliveryServiceImpl()).linkWith(new ProductServiceImpl());
        acceptOrderForDelivery.setMiddleware(middleware);
    }

    public static void main(String[] args) throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        //set parameters for user
        User user = new User();
        Date date = new Date();
        date.getTime();
        //set parameters for order
        Rapanas rapanas = new Rapanas(productRepository.findByType("original"));
        Vegetable onion = new Vegetable(productRepository.findByType("onion"));
        //create order
        OrderBuilder orderBuilder = new OrderBuilder();
        OrderBillBuilder orderBillBuilder = new OrderBillBuilder();

        orderBuilder.addRapanas(rapanas);
        orderBuilder.addExtraRapanasVegetable(onion);

        orderBillBuilder.addRapanas(rapanas);
        orderBillBuilder.addExtraRapanasVegetable(onion);

        System.out.println(orderBillBuilder.getResult().print());
        System.out.println(orderBuilder.getResult());
        System.out.println(IdentityMap.getProduct("original".toUpperCase()));

    }
}
