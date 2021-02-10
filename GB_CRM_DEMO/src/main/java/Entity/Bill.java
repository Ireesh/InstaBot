package Entity;

import java.math.BigDecimal;
import java.math.MathContext;

public class Bill {
    private Rapanas rapanas;
    private Rapan extraRapanPortion;
    private Sauce extraRapanasSauce;
    private Vegetable extraRapanasVegetable;
    private Beverage beverage;
    private Salad salad;
    private Sauce extraSaladSauce;
    private Vegetable extraSaladVegetable;
    private Chicken extraSaladChicken;
    private Salmon extraSaladSalmon;
    private Double totalCost;

    public Bill(Rapanas rapanas, Rapan extraRapanPortion, Sauce extraRapanasSauce,
                 Vegetable extraRapanasVegetable, Beverage beverage, Salad salad,
                 Sauce extraSaladSauce, Vegetable extraSaladVegetable, Chicken extraSaladChicken,
                 Salmon extraSaladSalmon) {
        this.rapanas = rapanas;
        if (this.rapanas != null) {
            this.extraRapanPortion = extraRapanPortion;
            this.extraRapanasSauce = extraRapanasSauce;
            this.extraRapanasVegetable = extraRapanasVegetable;
        }
        this.beverage = beverage;
        this.salad = salad;
        if (this.salad != null) {
            this.extraSaladSauce = extraSaladSauce;
            this.extraSaladVegetable = extraSaladVegetable;
            this.extraSaladChicken = extraSaladChicken;
            this.extraSaladSalmon = extraSaladSalmon;
        }
        totalCost = 0.0;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        if (rapanas != null) {
            sb.append("Rapanas: " + rapanas.getType() + " = " + rapanas.getPrice() + "$\n");
            totalCost += rapanas.getPrice();
            if (extraRapanPortion != null) {
                sb.append("Extra rapan: " + extraRapanPortion + "(" + extraRapanPortion.getWeight() + ") = " + extraRapanPortion.getPrice() + "$\n");
                totalCost += extraRapanPortion.getPrice();
            }
            if (extraRapanasSauce != null) {
                sb.append("Extra sauce: " + extraRapanasSauce.getType() + " = " + extraRapanasSauce.getPrice() + "$\n");
                totalCost += extraRapanasSauce.getPrice();
            }
            if (extraRapanasVegetable != null) {
                sb.append("Extra vegetable: " + extraRapanasVegetable + " = " + extraRapanasVegetable.getPrice() + "$\n");
                totalCost += extraRapanasVegetable.getPrice();
            }
        }
        if (beverage != null) {
            sb.append("Beverage: " + beverage.getType() + " = " + beverage.getPrice() + "$\n");
            totalCost += beverage.getPrice();
        }
        if (salad != null) {
            sb.append("Salad: " + salad.getType() + " = " + salad.getPrice() + "$\n");
            totalCost += salad.getPrice();
            if (extraSaladSauce != null) {
                sb.append("Extra sauce: " + extraSaladSauce.getType() + " = " + extraSaladSauce.getPrice() + "$\n");
                totalCost += extraSaladSauce.getPrice();
            }
            if (extraSaladVegetable != null) {
                sb.append("Extra vegetable: " + extraSaladVegetable + " = " + extraSaladVegetable.getPrice() + "$\n");
                totalCost += extraSaladVegetable.getPrice();
            }
            if (extraSaladChicken != null) {
                sb.append("Extra chicken: " + extraSaladChicken + "(" + extraSaladChicken.getWeight() + ")" + " = " + extraSaladChicken.getPrice() + "$\n");
                totalCost += extraSaladChicken.getPrice();
            }
            if (extraSaladSalmon != null) {
                sb.append("Extra salmon: " + extraSaladSalmon + "(" + extraSaladSalmon.getWeight() + ")" + " = " + extraSaladSalmon.getPrice() + "$\n");
                totalCost += extraSaladSalmon.getPrice();
            }
        }
        sb.append("Total cost: " + totalCost);

        return sb.toString();
    }

}
