package Entity;

import java.math.BigDecimal;

public class Beverage implements Product{
    private Double cost;
    private BeverageType beverageType;
    private double amount;

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

    public Double getAmount() { return amount; }

    @Override
    public String toString() {
        return beverageType.toString();
    }
}
