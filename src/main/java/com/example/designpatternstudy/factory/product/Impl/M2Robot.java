package com.example.designpatternstudy.factory.product.Impl;


import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.RobotType;
import com.example.designpatternstudy.factory.product.parts.cpu.Cpu;
import com.example.designpatternstudy.factory.product.parts.mem.Memory;
import java.time.LocalDate;

public class M2Robot extends Robot {

  public M2Robot(String name, RobotType robotType,
      Cpu cpu,
      Memory memory,
      LocalDate createDate, LocalDate updateDate) {
    super(name, robotType, cpu, memory, createDate, updateDate);
  }

  @Override
  public void move() {
    System.out.println("M2 Robot Move");
  }

}
