package com.example.designpatternstudy.factory.creator;

import com.example.designpatternstudy.factory.product.Robot;
import com.example.designpatternstudy.factory.product.parts.cpu.Cpu;

public interface RobotFactory {

  void validation(String name);

  void prepare();

  Robot orderRobot(String name);

  Robot createRobot(String name);

  Robot changePartByCPU(Robot robot, Cpu cpu);

  void sendToOwner();

}
