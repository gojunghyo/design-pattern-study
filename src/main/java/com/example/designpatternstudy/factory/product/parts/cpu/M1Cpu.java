package com.example.designpatternstudy.factory.product.parts.cpu;

public class M1Cpu implements Cpu {

  @Override
  public void info() {
    System.out.println("M1 CPU");
  }

  @Override
  public void repairing() {
    System.out.println("써멀 구리스 도포 작업중");
  }

  public static Cpu getInstance() {
    return M1CpuHolder.INSTANCE;
  }

  static class M1CpuHolder {
    private static final Cpu INSTANCE = new M1Cpu();
  }
}
