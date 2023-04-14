package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.event.EventRegistry;
import com.smalaca.ddd.annotations.AggregateRoot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@AggregateRoot
public class Cart {
    private final List<CartItem> cartItems = new ArrayList<>();
    private EventRegistry eventRegistry;

    public void acceptProducts(Map<UUID, Amount> products) {
        products.forEach((productId, amount) -> {
            if (hasNotEnoughOf(productId, amount)) {
                throw CartException.notExistingFor(productId, amount);
            }
        });

        eventRegistry.publish(ProductsAccepted.of(products));
    }

    private boolean hasNotEnoughOf(UUID productId, Amount amount) {
        return cartItems.stream()
                .anyMatch(cartItem -> {
                    return cartItem.isFor(productId) && cartItem.hasNotLessThan(amount);
                });
    }
}
