package Entity;

import java.math.BigDecimal;

public class Chicken implements Product{
    private Double cost = 4.5;
    private double weight = 70.0;
    private double amount;

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

    public Double getAmount() { return amount; }

    @Override
    public String toString() {
        return "chicken (" + weight + ")";
    }
}
