package by.bsu.sweets.view;

import by.bsu.sweets.model.AbstractSweet;
import by.bsu.sweets.model.Division;

import java.util.List;

public class DivisionPrinter {
    public void print(Division division){
        List<AbstractSweet>sweets = division.getSweets();
        for (AbstractSweet sweet: sweets){
            System.out.println("Name = "+sweet.getName());
            System.out.println("Weight = "+sweet.getWeight() );
            System.out.println("Price = "+sweet.getPrice() );
        }
    }
}
