package com.smalaca.cart.command.entities.amount;

import com.smalaca.ddd.annotations.ValueObject;
import lombok.RequiredArgsConstructor;

@ValueObject
@RequiredArgsConstructor
public class Amount {
    private final int value;
}
