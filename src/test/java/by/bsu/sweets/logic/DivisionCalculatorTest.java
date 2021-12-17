package by.bsu.sweets.logic;

import by.bsu.sweets.model.Chocalate;
import by.bsu.sweets.model.Division;
import by.bsu.sweets.model.Marshmallow;
import org.junit.Assert;
import org.junit.Test;

public class DivisionCalculatorTest {
    @Test
    public void testTotalWeightPositive(){
        Division division = new Division();
        Chocalate chocalate = new Chocalate("Dove",1,1,1);
        Marshmallow marshmallow = new Marshmallow("Hats",1,1,1);
        division.add(chocalate);
        division.add(marshmallow);
        DivisionCalculator calculate = new DivisionCalculator();
        double totalWeight = calculate.calculateTotalWeight(division);
        Assert.assertEquals(2,totalWeight,0.01);
    }
    @Test
    public void testTotalWeightNegative(){
        Division division = new Division();
        Chocalate chocalate = new Chocalate("Dove",10000,1,1);
        Marshmallow marshmallow = new Marshmallow("Hats",200,1,1);
        division.add(chocalate);
        division.add(marshmallow);
        DivisionCalculator calculate = new DivisionCalculator();
        double totalWeight = calculate.calculateTotalWeight(division);
        Assert.assertEquals(10200,totalWeight,0.01);
    }
    @Test
    public void testTotalPricePositive(){
        Division division = new Division();
        Chocalate chocalate = new Chocalate("Dove",10000,1,1);
        Marshmallow marshmallow = new Marshmallow("Hats",200,1,1);
        division.add(chocalate);
        division.add(marshmallow);
        DivisionCalculator calculate = new DivisionCalculator();
        double totalPrice = calculate.calculateTotalPrice(division);
        Assert.assertEquals(2,totalPrice,0.01);
    }
    @Test
    public void testTotalPriceNegative(){
        Division division = new Division();
        Chocalate chocalate = new Chocalate("Dove",10000,10000,1);
        Marshmallow marshmallow = new Marshmallow("Hats",200,550,1);
        division.add(chocalate);
        division.add(marshmallow);
        DivisionCalculator calculate = new DivisionCalculator();
        double totalPrice = calculate.calculateTotalPrice(division);
        Assert.assertEquals(10550,totalPrice,0.01);
    }
}
