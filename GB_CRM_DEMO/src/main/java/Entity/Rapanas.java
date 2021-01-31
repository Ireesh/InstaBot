package Entity;

import java.math.BigDecimal;

public class Rapanas implements Product{
    private Double cost;
    private RapanasType rapanasType;

    public Rapanas(RapanasType rapanasType) {
        this.rapanasType = rapanasType;
        switch (rapanasType){
            case ORIGINAL: cost = 25d;
                break;
            case VEGAN: cost = 22d;
                break;
            case DOUBLE: cost = 40d;
                break;
        }
    }

    public Double getCost() {
        return cost;
    }

    public RapanasType getRapanasType() {
        return rapanasType;
    }

    @Override
    public String toString() {
        return rapanasType.toString();
    }
}
