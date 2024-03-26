package com.example.designpatternstudy.bridge.product;

import com.example.designpatternstudy.bridge.robot.DefaultRobot;
import com.example.designpatternstudy.bridge.skin.RobotColor;

public class M1Robot extends DefaultRobot {


  public M1Robot(RobotColor robotColor) {
    super(robotColor, "M1 Robot");
  }
}
