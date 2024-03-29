package com.example.designpatternstudy.composite.custom;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<ShoppingCartElement> cartElement = ShoppingCartElementHolder.CART_ELEMENT_LIST;


  public void add(ShoppingCartElement element) {
    this.cartElement.add(element);
  }

  public Long totalPrice() {
    return this.cartElement
        .stream()
        .mapToLong(ShoppingCartElement::getPrice)
        .reduce((a1, a2) -> a1 + a2)
        .orElse(0L);
  }

  static class ShoppingCartElementHolder {
    private static final List<ShoppingCartElement> CART_ELEMENT_LIST = new ArrayList<>();
  }

}
