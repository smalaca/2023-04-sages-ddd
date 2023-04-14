package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.offer.Offer;
import com.smalaca.cart.command.entities.offer.OfferItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<OfferItem> offerItems = cartItems.stream()
                .map(CartItem::asOfferItem)
                .collect(Collectors.toList());

        return new Offer(offerItems);
    }
}
