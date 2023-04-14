package com.smalaca.order.adapters.rest.order;

import com.smalaca.order.command.usecases.order.OfferUseCase;

import java.util.UUID;

public class RestOrderController extends OfferRequest {
    private final OfferUseCase offerUseCase;

    public RestOrderController(OfferUseCase offerUseCase) {
        this.offerUseCase = offerUseCase;
    }

    public UUID acceptOffer(OfferRequest offerRequest) {
        return offerUseCase.acceptOffer(offerRequest);
    }
}
