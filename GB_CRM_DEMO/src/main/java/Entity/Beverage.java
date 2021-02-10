package Entity;

import java.math.BigDecimal;

public class Beverage extends Product{

    @Override
    public String toString() {
        return getType();
    }
}
