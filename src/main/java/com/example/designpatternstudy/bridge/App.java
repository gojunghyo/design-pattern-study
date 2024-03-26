package com.example.designpatternstudy.bridge;

import com.example.designpatternstudy.bridge.product.M1Robot;
import com.example.designpatternstudy.bridge.product.M2Robot;
import com.example.designpatternstudy.bridge.robot.ActionRobot;
import com.example.designpatternstudy.bridge.skin.BlackColor;
import com.example.designpatternstudy.bridge.skin.BlueColor;

public class App {

  public static void main(String[] args) {
    ActionRobot m1Robot = new M1Robot(new BlueColor());
    m1Robot.attack();
    m1Robot.shield();

    ActionRobot m2Robot = new M2Robot(new BlackColor());
    m2Robot.attack();
    m2Robot.shield();
  }
}
