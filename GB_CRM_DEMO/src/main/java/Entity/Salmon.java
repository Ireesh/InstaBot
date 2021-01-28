package Entity;

import java.math.BigDecimal;

public class Salmon {
    private Double cost = 5.5;
    private double weight = 40.0;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "salmon (" + weight + ")";
    }
}
