package com.smalaca.cart.command.entities.offer;

import java.util.UUID;

public interface OfferRepository {
    UUID save(Offer offer);
}
