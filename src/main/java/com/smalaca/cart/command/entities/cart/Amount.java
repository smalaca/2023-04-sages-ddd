package com.smalaca.cart.command.entities.cart;

import com.smalaca.ddd.annotations.ValueObject;
import lombok.RequiredArgsConstructor;

@ValueObject
@RequiredArgsConstructor
public class Amount {
    private final int value;

    boolean isNotLessThan(Amount amount) {
        return this.value >= amount.value;
    }

    int getValue() {
        return value;
    }
}
