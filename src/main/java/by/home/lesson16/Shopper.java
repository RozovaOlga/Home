package by.home.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Shopper {

    private final String name;

    private final List<String> productsInTheBasket;


    public Shopper(String name, List<String> productsInTheBasket) {
        this.name = name;
        this.productsInTheBasket = productsInTheBasket;
    }

    public String getName() {
        return name;
    }

    public List<String> getProductsInTheBasket() {
        return productsInTheBasket;
    }

    @Override
    public String toString() {
        return "Shopper{" +
                "name='" + name + '\'' +
                ", productsInTheBasket=" + productsInTheBasket +
                '}';
    }

    public static List<String> givenListProducts() {
        int numberOfProducts = ThreadLocalRandom.current().nextInt(1, 10);
        List<String> products = new ArrayList<>();
        for (int i = 0; i < numberOfProducts; i++) {
            int index = ThreadLocalRandom.current().nextInt(Products.getProducts().size());
            products.add(Products.getProducts().get(index));
        }
        return products;
    }
}