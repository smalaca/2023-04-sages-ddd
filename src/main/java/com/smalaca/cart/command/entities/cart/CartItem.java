package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.amount.Amount;
import com.smalaca.cart.command.entities.offer.OfferItem;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
class CartItem {
    private final UUID productId;
    private final Amount amount;

    OfferItem asOfferItem() {
        return new OfferItem(productId, amount);
    }
}
