package com.smalaca.order.command.entities.offer;

import com.smalaca.ddd.annotations.Repository;

import java.util.UUID;

@Repository
public interface OfferRepository {
    Offer findBy(UUID offerId);

    UUID save(Offer offer);
}
