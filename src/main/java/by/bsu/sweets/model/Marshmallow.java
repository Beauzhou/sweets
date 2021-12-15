package by.bsu.sweets.model;

public class Marshmallow extends AbstractSweet {
    private  int size;

    public Marshmallow(String name, double weight, double price, int size){
        super(name,weight,price);
        this.size = size;
    }
    public int getCapacity(){
        return size;
    }
}
