package Homework4.PracticalTask4;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product getTheMostExpensiveItem(Product[] products) {
        Product mostExpensive = products[0];
        for (Product p : products) {
            if (p.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }

    public Product() {
    }

    public Product getBiggestQuantity(Product[] products) {
        Product biggestQuantity = products[0];
        for (Product p : products) {
            if (p.getQuantity() > biggestQuantity.getQuantity()) {
                biggestQuantity = p;
            }
        }
        return biggestQuantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
