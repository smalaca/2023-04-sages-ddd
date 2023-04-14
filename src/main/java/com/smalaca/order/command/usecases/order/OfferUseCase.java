package com.smalaca.order.command.usecases.order;

import com.smalaca.order.adapters.rest.order.OfferRequest;
import com.smalaca.order.command.entities.offer.OfferRepository;
import com.smalaca.order.command.entities.offer.Offer;

import java.util.UUID;

public class OfferUseCase {
    private final OfferRepository offerRepository;

    public OfferUseCase(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public UUID acceptOffer(OfferRequest offerRequest) {
        Offer offer = offerRepository.findBy(offerRequest.offerId);
        offer.SetShipmentMethod(offerRequest.shipmentMethodId);
        offer.SetIsInvoice(offerRequest.isInvoice);
        offer.Accept();

        return offerRepository.save(offer);
    }
}
