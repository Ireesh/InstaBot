package Entity;

import java.math.BigDecimal;

public class Salad implements Product{
    private Double cost;
    private SaladType saladType;
    private double amount;

    public Salad(SaladType saladType) {
        this.saladType = saladType;
        switch (saladType){
            case CEASAR: cost = 35.8;
                break;
            case CLASSIC: cost = 24.4;
                break;
        }
    }

    public Double getCost() {
        return cost;
    }

    public SaladType getSaladType() {
        return saladType;
    }

    public Double getAmount() { return amount; }

    @Override
    public String toString() {
        return saladType.toString();
    }
}
