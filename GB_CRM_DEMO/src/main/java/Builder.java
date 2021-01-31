import Entity.*;

public interface Builder {
    void addRapanas(Rapanas rapanas);
    void addExtraRapanPortion(Rapan rapan);
    void addExtraRapanasSauce(Sauce sauce);
    void addExtraRapanasVegetable(Vegetable vegetable);
    void addBeverage(Beverage beverage);
    void addSalad(Salad salad);
    void addExtraSaladSauce(Sauce sauce);
    void addExtraSaladVegetable(Vegetable vegetable);
    void addExtraSaladChicken(Chicken chicken);
    void addExtraSaladSalmon(Salmon salmon);
}

