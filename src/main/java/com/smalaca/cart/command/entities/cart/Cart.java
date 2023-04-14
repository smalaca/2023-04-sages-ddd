package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.amount.Amount;
import com.smalaca.cart.command.entities.offer.Offer;
import com.smalaca.ddd.annotations.AggregateRoot;
import com.smalaca.ddd.annotations.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@AggregateRoot
public class Cart {
    private final List<CartItem> cartItems = new ArrayList<>();

    @Factory
    public Offer acceptProducts(Map<UUID, Amount> products) {
        /**
         * Koszyk
         * 3 kubki
         * 2 zeszyty
         * ->
         * Oferta
         * 1 kubek
         * 1 zeszyt
         * Koszyk
         * 3 kubki
         * 2 zeszyty
         */

        Offer.Builder builder = new Offer.Builder();
        products.forEach((productId, amount) -> {
            if (hasEnoughOf(productId, amount)) {
                builder.withItem(productId, amount);
            }
        });

        return builder.build();
    }

    private boolean hasEnoughOf(UUID productId, Amount amount) {
        return cartItems.stream()
                .anyMatch(cartItem -> {
                    return cartItem.isFor(productId) && cartItem.hasNotLessThan(amount);
                });
    }
}
