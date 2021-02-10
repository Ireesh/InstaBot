package Entity;

import java.math.BigDecimal;

public class Salmon extends Product{

    public Salmon(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.amount = product.getAmount();
        this.type = product.getType();
    }

    @Override
    public String toString() {
        return "salmon (" + weight + ")";
    }
}
