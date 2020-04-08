package by.home.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private static List<String> products = new ArrayList<>();

    public static List<String> getProducts() {
        return products;
    }

    static {
        products.add("мясо");
        products.add("молоко");
        products.add("яйца");
        products.add("туалетная бумага");
        products.add("сметана");
        products.add("творог");
        products.add("шампунь");
        products.add("лук");
        products.add("гречка");
        products.add("рис");
        products.add("кукла");
        products.add("машинка");
        products.add("сыр");
        products.add("хлеб");
        products.add("пиво");
    }
}
