package by.bsu.sweets;

import by.bsu.sweets.logic.DivisionCalculator;
import by.bsu.sweets.model.Chocalate;
import by.bsu.sweets.model.Division;
import by.bsu.sweets.model.Marshmallow;
import by.bsu.sweets.view.DivisionPrinter;

public class Main {
    public static void main(String[] args) {
        Division division = new Division();

        Chocalate chocalate = new Chocalate("Dove",3.0,5.0,500);
        Marshmallow marshmallow = new Marshmallow("Hats",1.0,1.0,4);

        division.add(chocalate);
        division.add(marshmallow);

        DivisionPrinter printer = new DivisionPrinter();
        printer.print(division);

        DivisionCalculator calculate = new DivisionCalculator();
        double totalWeight = calculate.calculateTotalWeight(division);
        double totalPrice = calculate.calculateTotalPrice(division);
        System.out.println("Total weight = "+totalWeight);
        System.out.println("Total price = "+totalPrice);
    }
}
