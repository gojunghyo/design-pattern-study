package com.example.designpatternstudy.composite.custom;

public class App {

  public static void main(String[] args) {
    Egg egg = new Egg("신선란30구", 10000L);
    Grape appleGrape = new Grape("애플 청포도", 13000L);

    System.out.println(String.format("계란 가격 = %s", egg.getPrice()));
    System.out.println(String.format("애플 청포도 가격 = %s", appleGrape.getPrice()));

    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.add(egg);
    shoppingCart.add(appleGrape);

    System.out.println(String.format("장바구니 전체 가격 = %s", shoppingCart.totalPrice()));

  }

}
