package com.example.designpatternstudy.composite.custom;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Egg implements ShoppingCartElement{

  private String name;
  private Long price;

  @Override
  public Long getPrice() {
    return this.price;
  }
}
