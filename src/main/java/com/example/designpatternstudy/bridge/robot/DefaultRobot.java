package com.example.designpatternstudy.bridge.robot;

import com.example.designpatternstudy.bridge.skin.RobotColor;

public class DefaultRobot implements ActionRobot{


  private RobotColor robotColor;
  private String name;

  public DefaultRobot(RobotColor robotColor, String name) {
    this.robotColor = robotColor;
    this.name = name;
  }

  @Override
  public void attack() {
    System.out.println(String.format("%s %s attack", robotColor.getColorName(), name));
  }

  @Override
  public void shield() {
    System.out.println(String.format("%s %s shield", robotColor.getColorName(), name));
  }
}
