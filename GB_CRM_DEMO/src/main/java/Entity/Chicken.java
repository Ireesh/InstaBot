package Entity;

import java.math.BigDecimal;

public class Chicken extends Product{

    @Override
    public String toString() {
        return "chicken (" + weight + ")";
    }
}
