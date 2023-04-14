package com.smalaca.cart.command.entities.offer;

import com.smalaca.cart.command.entities.amount.Amount;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class OfferItem {
    private final UUID productId;
    private final Amount amount;
}
