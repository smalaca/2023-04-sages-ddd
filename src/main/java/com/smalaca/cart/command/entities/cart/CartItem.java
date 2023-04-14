package com.smalaca.cart.command.entities.cart;

import com.smalaca.ddd.annotations.ValueObject;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@ValueObject
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class CartItem {
    private final UUID productId;
    private final Amount amount;

    boolean isFor(UUID productId) {
        return this.productId.equals(productId);
    }

    boolean hasNotLessThan(Amount amount) {
        return this.amount.isNotLessThan(amount);
    }
}
