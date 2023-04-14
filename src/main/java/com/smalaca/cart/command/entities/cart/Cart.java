package com.smalaca.cart.command.entities.cart;

import com.smalaca.cart.command.entities.amount.Amount;
import com.smalaca.cart.command.entities.offer.Offer;
import com.smalaca.ddd.annotations.AggregateRoot;
import com.smalaca.ddd.annotations.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@AggregateRoot
public class Cart {
    private final List<CartItem> cartItems = new ArrayList<>();

    @Factory
    public Offer acceptProducts(Map<UUID, Amount> products) {
        Offer.Builder builder = new Offer.Builder();
        products.forEach((productId, amount) -> {
            if (hasEnoughOf(productId, amount)) {
                builder.withItem(productId, amount);
            } else {
                throw CartException.notExistingFor(productId, amount);
            }
        });

        return builder.build();
    }

    public void addProducts(Map<UUID, Amount> products){

    if (products.isEmpty())
    {
        throw CartException.productsListIsEmpty();
    }

        products.forEach((productId, amount) -> {
                    if (isValidEntry(productId, amount)) {

                    } else {
                        throw CartException.amountLessThenOne( amount);
                    }
                });
        products.forEach((productId, amount) -> cartItems.add(new CartItem(productId, amount)));


    }

    private boolean hasEnoughOf(UUID productId, Amount amount) {
        return cartItems.stream()
                .anyMatch(cartItem -> {
                    return cartItem.isFor(productId) && cartItem.hasNotLessThan(amount);
                });
    }

    private boolean isValidEntry(UUID productId, Amount amount) {
            return amount.isNotLessThan (new Amount(1));
        }

}
