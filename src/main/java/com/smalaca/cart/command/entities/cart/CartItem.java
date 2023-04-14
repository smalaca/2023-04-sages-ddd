package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.amount.Amount;
import com.smalaca.ddd.annotations.ValueObject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@ValueObject
@Getter(AccessLevel.PACKAGE)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class CartItem {
    private final UUID productId;
    private final Amount amount;
}
