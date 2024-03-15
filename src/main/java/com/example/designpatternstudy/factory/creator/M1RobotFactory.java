package com.example.designpatternstudy.factory.creator;

import com.example.designpatternstudy.factory.product.Impl.M1Robot;
import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.RobotType;
import com.example.designpatternstudy.factory.product.parts.Cpu;

public class M1RobotFactory extends AbstractRobotFactory{

  @Override
  public Robot createRobot(String name) {
    return M1Robot.of(name, RobotType.WORK);
  }

  @Override
  public Robot changePartByCPU(Robot robot, Cpu cpu) {
    return robot.updateCPU(cpu);
  }
}
