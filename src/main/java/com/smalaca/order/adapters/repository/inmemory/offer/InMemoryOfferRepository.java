package com.smalaca.order.adapters.repository.inmemory.offer;

import com.smalaca.order.command.entities.offer.Offer;
import com.smalaca.order.command.entities.offer.OfferRepository;

import java.util.UUID;

public class InMemoryOfferRepository implements OfferRepository {

    @Override
    public Offer findBy(UUID offerId) {
        return null;
    }

    @Override
    public UUID save(Offer offer) {
        return null;
    }
}
