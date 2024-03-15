package com.example.designpatternstudy.factory.product.parts.mem;

public class DDR4Mem implements Memory{

  @Override
  public void info() {
    System.out.println("DDR4 Memory");
  }

  public static Memory getInstance() {
    return DDR4MemHolder.INSTANCE;
  }

  static class DDR4MemHolder {
    private static final Memory INSTANCE = new DDR4Mem();
  }
}
