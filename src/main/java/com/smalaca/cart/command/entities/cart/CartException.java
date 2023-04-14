package com.smalaca.cart.command.entities.cart;

import java.util.UUID;

class CartException extends RuntimeException {
    static RuntimeException notExistingFor(UUID productId, Amount amount) {
        return null;
    }
}
