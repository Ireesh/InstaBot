package Entity;

import java.math.BigDecimal;

public class Beverage {
    private Double cost;
    private BeverageType beverageType;

    public Beverage(BeverageType beverageType) {
        this.beverageType = beverageType;
        switch (beverageType){
            case COLA: cost = 5d;
                        break;
            case COFFEE: cost = 4d;
                        break;
            case TEA: cost = 2d;
                        break;
        }
    }

    public Double getCost() {
        return cost;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    @Override
    public String toString() {
        return beverageType.toString();
    }
}