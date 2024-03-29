package com.example.designpatternstudy.composite.custom;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Grape implements ShoppingCartElement{

  private String name;
  private Long price;

  @Override
  public Long getPrice() {
    return this.price;
  }
}
