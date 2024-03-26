package com.example.designpatternstudy.bridge.product;

import com.example.designpatternstudy.bridge.robot.DefaultRobot;
import com.example.designpatternstudy.bridge.skin.RobotColor;

public class M2Robot extends DefaultRobot {

  public M2Robot(RobotColor robotColor) {
    super(robotColor, "M2 Robot");
  }
}
