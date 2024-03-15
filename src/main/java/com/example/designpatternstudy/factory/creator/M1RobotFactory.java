package com.example.designpatternstudy.factory.creator;

import com.example.designpatternstudy.factory.creator.parts.RobotPartsFactory;
import com.example.designpatternstudy.factory.product.Impl.M1Robot;
import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.RobotType;
import com.example.designpatternstudy.factory.product.parts.cpu.Cpu;

public class M1RobotFactory extends AbstractRobotFactory{

  private final RobotPartsFactory robotPartsFactory;

  public M1RobotFactory(RobotPartsFactory robotPartsFactory) {
    this.robotPartsFactory = robotPartsFactory;
  }

  @Override
  public Robot createRobot(String name) {
    Robot robot = M1Robot.of(name, RobotType.WORK);
      robotPartsFactory.insertCPU(robot);
      robotPartsFactory.insertMemory(robot);
    return robot;
  }

  @Override
  public Robot changePartByCPU(Robot robot, Cpu cpu) {
    return robot.updateCPU(cpu);
  }
}
