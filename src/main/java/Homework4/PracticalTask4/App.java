package Homework4.PracticalTask4;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Iphone16", 6000, 530);
        Product product2 = new Product("Iphone15", 5000, 430);
        Product product3 = new Product("Iphone14", 4000, 330);
        Product product4 = new Product("Iphone13", 3000, 2230);

        Product[] products = {product1, product2, product3, product4};
        Product help = new Product();
        System.out.println("The most expensive item: ");
        System.out.println(help.getTheMostExpensiveItem(products));
        System.out.println("The biggest quantity item: ");
        System.out.println(help.getBiggestQuantity(products));
    }
}
