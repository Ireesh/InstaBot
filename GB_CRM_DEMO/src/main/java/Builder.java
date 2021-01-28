import Entity.*;

public interface Builder {
    void setRapanas(Rapanas rapanas);
    void setExtraRapanPortion(Rapan rapan);
    void setExtraRapanasSauce(Sauce sauce);
    void setExtraRapanasVegetable(Vegetable vegetable);
    void setBeverage(Beverage beverage);
    void setSalad(Salad salad);
    void setExtraSaladSauce(Sauce sauce);
    void setExtraSaladVegetable(Vegetable vegetable);
    void setExtraSaladChicken(Chicken chicken);
    void setExtraSaladSalmon(Salmon salmon);
}

