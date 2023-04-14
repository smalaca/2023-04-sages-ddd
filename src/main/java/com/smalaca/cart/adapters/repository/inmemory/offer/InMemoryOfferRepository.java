package com.smalaca.cart.adapters.repository.inmemory.offer;

import com.smalaca.cart.command.entities.offer.Offer;
import com.smalaca.cart.command.entities.offer.OfferRepository;

import java.util.UUID;

public class InMemoryOfferRepository implements OfferRepository {
    @Override
    public UUID save(Offer offer) {
        return null;
    }
}
