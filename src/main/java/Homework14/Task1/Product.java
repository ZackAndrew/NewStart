package Homework14.Task1;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String category;
    private LocalDate date;
    private double price;

    public Product(String category, LocalDate date, double price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public static List<Product> filterAndSortProducts(List<Product> products, String category, int minPrice, int year) {
        return products.stream()
                .filter(p -> category.equalsIgnoreCase(p.getCategory()))
                .filter(p -> p.getPrice() > minPrice)
                .filter(p -> p.getDate().isBefore(LocalDate.now().minusYears(year)))
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return String.format(
                "Product [Category: %-12s | Date: %s | Price: %.2f грн]",
                category,
                date,
                price
        );
    }
}
