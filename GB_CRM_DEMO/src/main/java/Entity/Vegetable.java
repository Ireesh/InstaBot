package Entity;

import java.math.BigDecimal;

public class Vegetable implements Product{
    private Double cost = 10d;
    private double amount;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getAmount() { return amount; }

    @Override
    public String toString() {
        return "some vegetables";
    }
}
