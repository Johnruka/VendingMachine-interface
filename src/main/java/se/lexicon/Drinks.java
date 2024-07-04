package se.lexicon;

public class Drinks implements Product {

    private final int id;
    private String drinksName;
    private String volume;
    private double price;

    public Drinks(String drinksName, long volume, double price) {
        this.id = productSequencer.nextId();

   }
    @Override
    public String examine() {
        return "{ id: " + id + ", drinks: " + drinksName + " with " +  " volume }";
    }

    @Override
    public String use() {
        String description = drinksName;
        return description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return drinksName;
    }

    @Override
    public void setProductName(String productName) {
        this.drinksName = productName;

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;


    }
}
