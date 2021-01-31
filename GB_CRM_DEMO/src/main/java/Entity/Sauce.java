package Entity;

import java.math.BigDecimal;

public class Sauce implements Product{
    private Double cost;
    private SauceType sauceType;

    public Sauce(SauceType sauceType) {
        this.sauceType = sauceType;
        switch (sauceType){
            case KETCHUP: cost = 2.1;
                break;
            case TERIYAKI: cost = 2.2;
                break;
        }
    }

    public Double getCost() {
        return cost;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    @Override
    public String toString() {
        return sauceType.toString();
    }
}
