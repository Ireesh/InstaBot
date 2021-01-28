package Entity;

import java.math.BigDecimal;

public class Rapan {
    private Double cost = 5d;
    private double weight = 50.0;

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
        return "rapan (" + weight + ")";
    }
}
