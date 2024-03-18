package com.example.designpatternstudy.builder.model;

import java.time.LocalDate;

public interface RobotBuilder {

  RobotBuilder name(String name);

  RobotBuilder createDate(LocalDate localDate);

  RobotBuilder addSkill(DetailRobotSkill detailRobotSkill);

  DefaultRobot getDefaultRobot();
}
