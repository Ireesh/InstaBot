import Entity.*;

public class OrderBillBuilder implements Builder{
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

    @Override
    public void addRapanas(Rapanas rapanas) {
        this.rapanas = rapanas;
    }

    @Override
    public void addExtraRapanPortion(Rapan rapan) {
        this.extraRapanPortion = rapan;
    }

    @Override
    public void addExtraRapanasSauce(Sauce sauce) {
        this.extraRapanasSauce = sauce;
    }

    @Override
    public void addExtraRapanasVegetable(Vegetable vegetable) {
        this.extraRapanasVegetable = vegetable;
    }

    @Override
    public void addBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void addSalad(Salad salad) {
        this.salad = salad;
    }

    @Override
    public void addExtraSaladSauce(Sauce sauce) {
        this.extraSalasSauce = sauce;
    }

    @Override
    public void addExtraSaladVegetable(Vegetable vegetable) {
        this.extraSaladVegetable = vegetable;
    }

    @Override
    public void addExtraSaladChicken(Chicken chicken) {
        this.extraSaladChicken = chicken;
    }

    @Override
    public void addExtraSaladSalmon(Salmon salmon) {
        this.extraSaladSalmon = salmon;
    }

    public Bill getResult() {
        return new Bill(rapanas, extraRapanPortion, extraRapanasSauce, extraRapanasVegetable,
                beverage, salad, extraSalasSauce, extraSaladVegetable, extraSaladChicken, extraSaladSalmon);
    }
}
