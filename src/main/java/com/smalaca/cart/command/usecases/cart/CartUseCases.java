package com.smalaca.cart.command.usecases.cart;

import com.smalaca.cart.command.entities.cart.Amount;
import com.smalaca.cart.command.entities.cart.Cart;
import com.smalaca.cart.command.entities.cart.CartRepository;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CartUseCases {
    private final CartRepository cartRepository;

    public CartUseCases(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Transactional
    public void acceptProducts(UUID cartId, Map<UUID, Integer> products) {
        // tłumaczenie na język domenowy 0 ... *
        // id -> aggregate
        // raw data -> value object
        // input -> domain input
        Cart cart = cartRepository.findBy(cartId);
        Map<UUID, Amount> productsVO = new HashMap<>();
        products.forEach((productId, value) -> productsVO.put(productId, new Amount(value)));

        // wywołanie JEDNEJ akcji na domenie
        cart.acceptProducts(productsVO);

        // zapisanie rezultatu 1(0) ... *
//        return offerRepository.save(offer);
    }
}
