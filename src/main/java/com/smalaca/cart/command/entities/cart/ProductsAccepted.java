package com.smalaca.cart.command.entities.cart;

import java.util.Map;
import java.util.UUID;

import static java.util.stream.Collectors.toMap;

public class ProductsAccepted {
    private final Map<UUID, Integer> products;

    public ProductsAccepted(Map<UUID, Integer> products) {
        this.products = products;
    }

    static ProductsAccepted of(Map<UUID, Amount> products) {
        Map<UUID, Integer> productsMap = products.entrySet().stream()
                .collect(toMap(Map.Entry::getKey, ProductsAccepted::asValue));

        return new ProductsAccepted(productsMap);
    }

    private static int asValue(Map.Entry<UUID, Amount> entry) {
        return entry.getValue().getValue();
    }
}
