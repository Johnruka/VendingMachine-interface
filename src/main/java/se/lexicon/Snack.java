package se.lexicon;

public class Snack implements Product {

    private final int id;
    private double price;
    private String snack;

    public Snack(int id, int price, String snack) {

        this.id = productSequencer.nextId();
        this.price = price;
        this.snack = snack;

    }

    @Override
    public String examine() {
        return "{ id: " + id + ", snack: " + snack + " }";
    }

    @Override
    public String use() {
        return snack;
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
