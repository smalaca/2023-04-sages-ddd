package com.smalaca.order.command.entities.offer;

import com.smalaca.ddd.annotations.AggregateRoot;
import com.smalaca.order.adapters.rest.order.OfferRequest;

@AggregateRoot
public class Offer {
    private boolean isAccepted;
    private Integer shipmentMethodId;
    private boolean isInvoice;
    public void Accept(OfferRequest offerRequest) {
        this.shipmentMethodId = offerRequest.shipmentMethodId;
        this.isInvoice = offerRequest.isInvoice;
        //...
        isAccepted = true;
    }
}
