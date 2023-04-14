package com.smalaca.cart.command.entities.offer;

import com.smalaca.cart.command.entities.amount.Amount;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Offer {
    private final List<OfferItem> offerItems;

    private Offer(List<OfferItem> offerItems) {
        this.offerItems = offerItems;
    }

    public static class Builder {
        private final List<OfferItem> offerItems = new ArrayList<>();

        public void withItem(UUID productId, Amount amount) {
            offerItems.add(new OfferItem(productId, amount));
        }

        public Offer build() {
            return new Offer(offerItems);
        }
    }
}
