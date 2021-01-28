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
            sb.append("Rapanas: " + rapanas.getRapanasType() + " = " + rapanas.getCost() + "$\n");
            totalCost += rapanas.getCost();
            if (extraRapanPortion != null) {
                sb.append("Extra rapan: " + extraRapanPortion + "(" + extraRapanPortion.getWeight() + ") = " + extraRapanPortion.getCost() + "$\n");
                totalCost += extraRapanPortion.getCost();
            }
            if (extraRapanasSauce != null) {
                sb.append("Extra sauce: " + extraRapanasSauce.getSauceType() + " = " + extraRapanasSauce.getCost() + "$\n");
                totalCost += extraRapanasSauce.getCost();
            }
            if (extraRapanasVegetable != null) {
                sb.append("Extra vegetable: " + extraRapanasVegetable + " = " + extraRapanasVegetable.getCost() + "$\n");
                totalCost += extraRapanasVegetable.getCost();
            }
        }
        if (beverage != null) {
            sb.append("Beverage: " + beverage.getBeverageType() + " = " + beverage.getCost() + "$\n");
            totalCost += beverage.getCost();
        }
        if (salad != null) {
            sb.append("Salad: " + salad.getSaladType() + " = " + salad.getCost() + "$\n");
            totalCost += salad.getCost();
            if (extraSaladSauce != null) {
                sb.append("Extra sauce: " + extraSaladSauce.getSauceType() + " = " + extraSaladSauce.getCost() + "$\n");
                totalCost += extraSaladSauce.getCost();
            }
            if (extraSaladVegetable != null) {
                sb.append("Extra vegetable: " + extraSaladVegetable + " = " + extraSaladVegetable.getCost() + "$\n");
                totalCost += extraSaladVegetable.getCost();
            }
            if (extraSaladChicken != null) {
                sb.append("Extra chicken: " + extraSaladChicken + "(" + extraSaladChicken.getWeight() + ")" + " = " + extraSaladChicken.getCost() + "$\n");
                totalCost += extraSaladChicken.getCost();
            }
            if (extraSaladSalmon != null) {
                sb.append("Extra salmon: " + extraSaladSalmon + "(" + extraSaladSalmon.getWeight() + ")" + " = " + extraSaladSalmon.getCost() + "$\n");
                totalCost += extraSaladSalmon.getCost();
            }
        }
        sb.append("Total cost: " + totalCost);

        return sb.toString();
    }

}
