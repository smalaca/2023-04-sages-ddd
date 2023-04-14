package com.smalaca.cart.command.entities.event;

import com.smalaca.cart.command.entities.cart.ProductsAccepted;

public interface EventRegistry {
    void publish(ProductsAccepted productsAccepted);
}
