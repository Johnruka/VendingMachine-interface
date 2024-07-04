package se.lexicon;


public class App {
    public static void main(String[] args) {
        Product[] products = {
                new Drinks("Fanta", 1L, 50),
                new Drinks("Sprite", 1L, 50),
                new Drinks("Coca-Cola", 1L, 50),
                new Drinks("Mango", 1L, 65),
                new Drinks("Orange", 1L, 65),
                new Drinks("Apple", 1L, 65),
                new Snack(30, "Chocolate"),
                new Snack(30, "Gnuts"),
                new Snack(30, "Chips"),
                new Snack(45, "Muffin"),


        };
        VendingMachine vendingMachine = new IVendingMachine(products);

        for (String string : vendingMachine.getProducts()) {
            System.out.println(string);
            System.out.println("-----");

        }

        vendingMachine.addCurrency(100);
        Product Fanta = vendingMachine.request(1);
        System.out.println(Fanta.use());
        System.out.println(vendingMachine.getBalance());

    }
}
