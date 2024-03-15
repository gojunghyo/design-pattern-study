package com.example.designpatternstudy.factory.creator.parts;

import com.example.designpatternstudy.factory.product.Robot;

public interface RobotPartsFactory {

  void insertCPU(Robot robot);

  void insertMemory(Robot robot);
}
