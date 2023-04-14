package com.smalaca.cart.command.entities.offer;

import com.smalaca.cart.command.entities.amount.Amount;
import com.smalaca.ddd.annotations.ValueObject;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@ValueObject
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class OfferItem {
    private final UUID productId;
    private final Amount amount;
}
