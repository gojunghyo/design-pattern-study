package com.example.designpatternstudy.factory.creator.parts;

import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.parts.cpu.M1Cpu;
import com.example.designpatternstudy.factory.product.parts.mem.DDR3Mem;

public class M1PartFactory implements RobotPartsFactory{

  @Override
  public void insertCPU(Robot robot) {
    robot.insertCPU(M1Cpu.getInstance());
  }

  @Override
  public void insertMemory(Robot robot) {
    robot.insertMemory(DDR3Mem.getInstance());
  }
}
