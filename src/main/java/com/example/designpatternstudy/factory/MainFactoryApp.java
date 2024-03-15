package com.example.designpatternstudy.factory;

import com.example.designpatternstudy.factory.creator.M1RobotFactory;
import com.example.designpatternstudy.factory.creator.M2RobotFactory;
import com.example.designpatternstudy.factory.product.Robot;

public class MainFactoryApp {

  public static void main(String[] args) {
    Robot m2Robot = new M2RobotFactory().orderRobot("M2Robot");
    System.out.println(m2Robot);


    Robot m1Robot = new M1RobotFactory().orderRobot("M1Robot");
    System.out.println(m1Robot);

  }

}
