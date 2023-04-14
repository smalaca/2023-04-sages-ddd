package com.smalaca.cart.adapters.rest.cart;

import com.smalaca.cart.command.usecases.cart.CartUseCases;

import java.util.Map;
import java.util.UUID;

public class RestCartController {
    private final CartUseCases cartUseCases;

    public RestCartController(CartUseCases cartUseCases) {
        this.cartUseCases = cartUseCases;
    }

    public UUID acceptProducts(UUID cartId, Map<UUID, Integer> products) {
        return cartUseCases.acceptProducts(cartId, products);
    }
}
