package Entity;

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
