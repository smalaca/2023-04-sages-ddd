package com.smalaca.order.adapters.rest.order;

import java.util.UUID;

public class OfferRequest {
    public UUID offerId;
    public Integer shipmentMethodId;
    public boolean isInvoice;
    public boolean isPrivatePerson;
    public String clientName;
}
