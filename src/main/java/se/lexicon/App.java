package se.lexicon;


public class App {
    public static void main(String[] args) {
        Product[] products = {
                new Drinks(1, "Fanta", 1L,50),
                new Drinks(2, "Sprite",1L ,50),
                new Drinks(3, "Coca-Cola",1L ,50),
                new Drinks(4, "Mango", 1L,50),
                new Drinks(5, "Orange", 1L,50),
                new Drinks(6, "Apple", 1L,50),
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
