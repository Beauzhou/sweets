package by.bsu.sweets.model;

public class Chocalate extends AbstractSweet {

    private int calories;

    public Chocalate(String name, double weight,double price, int calories){
        super(name,weight,price);
        this.calories = calories;
    }
    public double getCalories(){

        return calories;
    }

}
