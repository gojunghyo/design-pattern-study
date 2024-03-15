package com.example.designpatternstudy.factory.product.parts.mem;

public class DDR3Mem implements Memory {

  @Override
  public void info() {
    System.out.println("DDR3 Memory");
  }

  public static Memory getInstance() {
    return DDR3MemHolder.INSTANCE;
  }

  static class DDR3MemHolder {
    private static final Memory INSTANCE = new DDR3Mem();
  }

}
