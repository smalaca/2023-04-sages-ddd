package com.smalaca.order.command.entities.offer;

import com.smalaca.ddd.annotations.AggregateRoot;

@AggregateRoot
public class Offer {
    private boolean isAccepted;
    private Integer shipmentMethodId;
    private boolean isInvoice;
    public void Accept() {
        isAccepted = true;
    }

    public void SetShipmentMethod(Integer shipmentMethodId) {
        this.shipmentMethodId = shipmentMethodId;
    }

    public void SetIsInvoice(boolean isInvoice) {
        this.isInvoice = isInvoice;
    }
}
