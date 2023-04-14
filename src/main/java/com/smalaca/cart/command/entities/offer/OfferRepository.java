package com.smalaca.cart.command.entities.offer;

import com.smalaca.ddd.annotations.Repository;

import java.util.UUID;

@Repository
public interface OfferRepository {
    UUID save(Offer offer);
}
