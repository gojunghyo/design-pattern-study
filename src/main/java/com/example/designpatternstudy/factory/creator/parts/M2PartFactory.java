package com.example.designpatternstudy.factory.creator.parts;

import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.parts.cpu.M2Cpu;
import com.example.designpatternstudy.factory.product.parts.mem.DDR4Mem;

public class M2PartFactory implements RobotPartsFactory{

  @Override
  public void insertCPU(Robot robot) {
    robot.insertCPU(M2Cpu.getInstance());
  }

  @Override
  public void insertMemory(Robot robot) {
    robot.insertMemory(DDR4Mem.getInstance());
  }
}
