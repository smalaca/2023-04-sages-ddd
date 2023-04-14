package com.smalaca.cart.command.entities.cart;

import java.util.UUID;

public interface CartRepository {
    Cart findBy(UUID cartId);
}
