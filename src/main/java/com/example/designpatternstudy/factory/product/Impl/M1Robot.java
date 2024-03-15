package com.example.designpatternstudy.factory.product.Impl;

import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.RobotType;
import com.example.designpatternstudy.factory.product.parts.Cpu;
import com.example.designpatternstudy.factory.product.parts.Memory;
import java.time.LocalDate;

public class M1Robot extends Robot {

  public M1Robot(String name, RobotType robotType,
      Cpu cpu,
      Memory memory,
      LocalDate createDate, LocalDate updateDate) {
    super(name, robotType, cpu, memory, createDate, updateDate);
  }

  @Override
  public void move() {
    System.out.println("M1 Robot Move");
  }

}
