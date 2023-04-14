package com.smalaca.cart.command.entities.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer {
    private final List<OfferItem> offerItems;

    public Offer(List<OfferItem> offerItems) {
        this.offerItems = offerItems;
    }
}
