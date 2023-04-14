package com.smalaca.cart.command.usecases.cart;

import com.smalaca.cart.command.entities.cart.Cart;
import com.smalaca.cart.command.entities.cart.CartRepository;
import com.smalaca.cart.command.entities.offer.Offer;
import com.smalaca.cart.command.entities.offer.OfferRepository;

import javax.transaction.Transactional;
import java.util.UUID;

public class CartUseCases {
    private final OfferRepository offerRepository;
    private final CartRepository cartRepository;

    public CartUseCases(OfferRepository offerRepository, CartRepository cartRepository) {
        this.offerRepository = offerRepository;
        this.cartRepository = cartRepository;
    }

    @Transactional
    public UUID acceptProducts(UUID cartId) {
        // tłumaczenie na język domenowy 0 ... *
        // id -> aggregate
        // raw data -> value object
        // input -> domain input
        Cart cart = cartRepository.findBy(cartId);

        // wywołanie JEDNEJ akcji na domenie
        Offer offer = cart.acceptProducts();

        // zapisanie rezultatu 1(0) ... *
        return offerRepository.save(offer);
    }
}
