import Entity.*;

public class Launcher {
    public static void main(String[] args) {

        Rapanas rapanas = new Rapanas(RapanasType.ORIGINAL);
        Vegetable vegetable = new Vegetable();
        Salmon salmon = new Salmon();
        Salad salad = new Salad(SaladType.CEASAR);
        Beverage beverage = new Beverage(BeverageType.COLA);

        OrderBuilder orderBuilder = new OrderBuilder();
        OrderBillBuilder orderBillBuilder = new OrderBillBuilder();

        orderBuilder.setRapanas(rapanas);
        orderBuilder.setExtraRapanasVegetable(vegetable);
        orderBuilder.setSalad(salad);
        orderBuilder.setExtraSaladSalmon(salmon);
        orderBuilder.setBeverage(beverage);

        orderBillBuilder.setRapanas(rapanas);
        orderBillBuilder.setExtraRapanasVegetable(vegetable);
        orderBillBuilder.setSalad(salad);
        orderBillBuilder.setExtraSaladSalmon(salmon);
        orderBillBuilder.setBeverage(beverage);

        System.out.println(orderBuilder.getResult());
        System.out.println();
        System.out.println(orderBillBuilder.getResult().print());

    }
}
