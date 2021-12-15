package by.bsu.sweets.logic;

import by.bsu.sweets.model.AbstractSweet;
import by.bsu.sweets.model.Division;

import java.util.List;

public class DivisionCalculator {

    public double calculateTotalWeight(Division division) {
        List<AbstractSweet> sweets = division.getSweets();
        double totalWeight = 0;
        for (AbstractSweet sweet : sweets) {
            totalWeight = totalWeight + sweet.getWeight();

        }
        return totalWeight;
    }

    public double calculateTotalPrice(Division division) {
        List<AbstractSweet> sweets = division.getSweets();
        double totalPrice = 0;
        for (AbstractSweet sweet : sweets) {
            totalPrice = totalPrice + sweet.getPrice();

        }
        return totalPrice;

    }
}

