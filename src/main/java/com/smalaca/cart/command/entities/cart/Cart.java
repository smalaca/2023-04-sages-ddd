package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> cartItems = new ArrayList<>();

    public Offer acceptProducts() {
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
        cartItems.forEach(cartItem -> {
            builder.withItem(cartItem.getProductId(), cartItem.getAmount());
        });

        return builder.build();
    }
}
