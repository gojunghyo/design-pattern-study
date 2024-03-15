package com.example.designpatternstudy.factory.creator;

import com.example.designpatternstudy.factory.product.Robot;

public abstract class AbstractRobotFactory implements RobotFactory{

  @Override
  public void validation(String name) {
    if(name == null || name.isEmpty()) {
      throw new IllegalArgumentException("로봇 이름이 유효한 값이 아닙니다.");
    }
  }

  @Override
  public void prepare() {
    System.out.println("로봇 만들 준비중");
  }

  @Override
  public Robot orderRobot(String name) {
    validation(name);
    prepare();
    Robot robot = createRobot(name);//하위 클래스에게 위임, changeParts 또한 위임
    sendToOwner();
    return robot;
  }

  @Override
  public void sendToOwner() {
    System.out.println("로봇을 만들었습니다.");
  }
}
