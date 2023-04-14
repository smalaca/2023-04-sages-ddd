package com.smalaca.cart.adapters.repository.inmemory.cart;

import com.smalaca.cart.command.entities.cart.Cart;
import com.smalaca.cart.command.entities.cart.CartRepository;

import java.util.UUID;

public class InMemoryCartRepository implements CartRepository {
//    private final OrmBasedCartRepository repository;

    @Override
    public Cart findBy(UUID cartId) {
        return null;
    }
}
