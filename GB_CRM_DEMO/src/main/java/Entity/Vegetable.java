package Entity;

import java.math.BigDecimal;

public class Vegetable extends Product{

    @Override
    public String toString() {
        return getType();
    }
}
