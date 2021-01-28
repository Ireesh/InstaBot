package Entity;

import java.math.BigDecimal;

public class Vegetable {
    private Double cost = 10d;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "some vegetables";
    }
}
