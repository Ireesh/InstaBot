package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Rapanas rapanas;
    private Rapan extraRapanPortion;
    private Sauce extraRapanasSauce;
    private Vegetable extraRapanasVegetable;
    private Beverage beverage;
    private Salad salad;
    private Sauce extraSalasSauce;
    private Vegetable extraSaladVegetable;
    private Chicken extraSaladChicken;
    private Salmon extraSaladSalmon;
    private Date dateDelivery;
    private int timeDelivery; //Example (10:34 = 1034)
    private Address address;

    public Order(Rapanas rapanas, Rapan extraRapanPortion, Sauce extraRapanasSauce,
                 Vegetable extraRapanasVegetable, Beverage beverage, Salad salad,
                 Sauce extraSalasSauce, Vegetable extraSaladVegetable, Chicken extraSaladChicken,
                 Salmon extraSaladSalmon) {
        this.rapanas = rapanas;
        if (this.rapanas != null) {
            this.extraRapanPortion = extraRapanPortion;
            this.extraRapanasSauce = extraRapanasSauce;
            this.extraRapanasVegetable = extraRapanasVegetable;
        }
        this.beverage = beverage;
        this.salad = salad;
        if (this.salad != null) {
            this.extraSalasSauce = extraSalasSauce;
            this.extraSaladVegetable = extraSaladVegetable;
            this.extraSaladChicken = extraSaladChicken;
            this.extraSaladSalmon = extraSaladSalmon;
        }
    }


    public Rapanas getRapanas() {
        return rapanas;
    }

    public Rapan getExtraRapanPortion() {
        return extraRapanPortion;
    }

    public Sauce getExtraRapanasSauce() {
        return extraRapanasSauce;
    }

    public Vegetable getExtraRapanasVegetable() {
        return extraRapanasVegetable;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Salad getSalad() {
        return salad;
    }

    public Sauce getExtraSalasSauce() {
        return extraSalasSauce;
    }

    public Vegetable getExtraSaladVegetable() {
        return extraSaladVegetable;
    }

    public Chicken getExtraSaladChicken() {
        return extraSaladChicken;
    }

    public  Salmon getExtraSaladSalmon() {
        return extraSaladSalmon;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public int getTimeDelivery() {
        return timeDelivery;
    }

    public void setTimeDelivery(int timeDelivery) {
        this.timeDelivery = timeDelivery;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.add(this.getBeverage());
        products.add(this.getRapanas());
        products.add(this.getSalad());
        products.add(this.getExtraRapanasSauce());
        products.add(this.getExtraRapanasVegetable());
        products.add(this.getExtraSaladVegetable());
        products.add(this.getExtraSalasSauce());
        products.add(this.getExtraRapanPortion());
        products.add(this.getExtraSaladChicken());
        products.add(this.getExtraSaladSalmon());
        return products;
    }


    @Override
    public String toString() {
        return "Rapanas:" + rapanas +
                "\n  extra: " + extraRapanPortion +
                "\n  extra: " + extraRapanasSauce+
                "\n  extra: " + extraRapanasVegetable +
                "\nSalad: " + salad+
                "\n  extra: " + extraSalasSauce +
                "\n  extra: " + extraSaladVegetable +
                "\n  extra: " + extraSaladChicken +
                "\n  extra: " + extraSaladSalmon +
                "\nBeverage: " + beverage;
    }
}
