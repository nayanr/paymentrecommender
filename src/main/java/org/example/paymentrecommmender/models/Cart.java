package org.example.paymentrecommmender.models;

import java.util.List;

public class Cart {

    private List<Cart> childCarts;
    private int cartAmount;

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Cart(List<Cart> childCarts, int cartAmount, String userId) {
        this.childCarts = childCarts;
        this.cartAmount = cartAmount;
        this.userId = userId;
    }

    public List<Cart> getChildCarts() {
        return childCarts;
    }

    public void setChildCarts(List<Cart> childCarts) {
        this.childCarts = childCarts;
    }

    public int getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(int cartAmount) {
        this.cartAmount = cartAmount;
    }
}
