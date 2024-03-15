package com.example.designpatternstudy.factory.product.parts.cpu;

public class M2Cpu implements Cpu{

  @Override
  public void info() {
    System.out.println("M2 CPU");
  }

  @Override
  public void repairing() {
    System.out.println("써멀 구리스 도포 작업중");
  }

  public static Cpu getInstance() {
    return M2CpuHolder.INSTANCE;
  }

  static class M2CpuHolder {
    private final static Cpu INSTANCE = new M2Cpu();
  }
}
