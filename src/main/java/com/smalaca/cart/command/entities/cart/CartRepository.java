package com.smalaca.cart.command.entities.cart;

import com.smalaca.ddd.annotations.Repository;
import org.checkerframework.checker.units.qual.A;

import java.util.UUID;

@Repository
public interface CartRepository {
    Cart findBy(UUID cartId);
    void save(Cart cart);
}
