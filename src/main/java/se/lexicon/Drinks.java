package se.lexicon;

public class Drinks implements Product {

    private final int id;
    private String drinksName;
    private String volume;
    private double price;

    public Drinks(String drinksName,String volume, double price) {
        this.id = productSequencer.nextId();

   }
    @Override
    public String examine() {
        return "{ id: " + id + ", drinks: " + drinksName + " with " +  " volume }";
    }

    @Override
    public String use() {
        return "";
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getProductName() {
        return "";
    }

    @Override
    public void setProductName(String productName) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }
}
