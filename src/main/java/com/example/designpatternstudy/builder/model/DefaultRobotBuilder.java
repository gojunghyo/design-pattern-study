package com.example.designpatternstudy.builder.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultRobotBuilder implements RobotBuilder{

  private String name;

  private LocalDate createDate;

  private List<DetailRobotSkill> robotSkillList;


  @Override
  public RobotBuilder name(String name) {
    this.name = name;
    return this;
  }

  @Override
  public RobotBuilder createDate(LocalDate localDate) {
    this.createDate = LocalDate.now();
    return this;
  }

  @Override
  public RobotBuilder addSkill(DetailRobotSkill detailRobotSkill) {
    if(robotSkillList == null) {
      this.robotSkillList = new ArrayList<>();
    }
    this.robotSkillList.add(detailRobotSkill);
    return this;
  }

  @Override
  public DefaultRobot getDefaultRobot() {
    return new DefaultRobot(name, createDate, robotSkillList);
  }
}
