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
    public void setRapanas(Rapanas rapanas) {
        this.rapanas = rapanas;
    }

    @Override
    public void setExtraRapanPortion(Rapan rapan) {
        this.extraRapanPortion = rapan;
    }

    @Override
    public void setExtraRapanasSauce(Sauce sauce) {
        this.extraRapanasSauce = sauce;
    }

    @Override
    public void setExtraRapanasVegetable(Vegetable vegetable) {
        this.extraRapanasVegetable = vegetable;
    }

    @Override
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    @Override
    public void setExtraSaladSauce(Sauce sauce) {
        this.extraSalasSauce = sauce;
    }

    @Override
    public void setExtraSaladVegetable(Vegetable vegetable) {
        this.extraSaladVegetable = vegetable;
    }

    @Override
    public void setExtraSaladChicken(Chicken chicken) {
        this.extraSaladChicken = chicken;
    }

    @Override
    public void setExtraSaladSalmon(Salmon salmon) {
        this.extraSaladSalmon = salmon;
    }

    public Bill getResult() {
        return new Bill(rapanas, extraRapanPortion, extraRapanasSauce, extraRapanasVegetable,
                beverage, salad, extraSalasSauce, extraSaladVegetable, extraSaladChicken, extraSaladSalmon);
    }
}
