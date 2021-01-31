package ru.job4j.tracker.oop;

public final class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int price() {
        return price - discount();
    }

    public int discount() {
        return 0;
    }

    public String label() {
        return name + " " + price();
    }
}

 final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}
