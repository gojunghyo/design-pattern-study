package com.example.designpatternstudy.factory.creator;

import com.example.designpatternstudy.factory.creator.parts.RobotPartsFactory;
import com.example.designpatternstudy.factory.product.Impl.M2Robot;
import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.RobotType;
import com.example.designpatternstudy.factory.product.parts.cpu.Cpu;

public class M2RobotFactory extends AbstractRobotFactory{

  private final RobotPartsFactory robotPartsFactory;

  public M2RobotFactory(RobotPartsFactory robotPartsFactory) {
    this.robotPartsFactory = robotPartsFactory;
  }

  // m2 로봇 팩토리에서 파트 의존성을 주입받고 파트를 업데이트 하는 형식으로
  // 추상메서드 팩토리 패턴 (여러 객체들을 추상화하여 주입받는다)
  @Override
  public Robot createRobot(String name) {
    Robot robot = M2Robot.of(name, RobotType.TEACH);
    robotPartsFactory.insertCPU(robot);
    robotPartsFactory.insertMemory(robot);
    return robot;
  }

  @Override
  public Robot changePartByCPU(Robot robot, Cpu cpu) {
    return robot.updateCPU(cpu);
  }
}
