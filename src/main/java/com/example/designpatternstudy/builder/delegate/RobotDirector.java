package com.example.designpatternstudy.builder.delegate;

import com.example.designpatternstudy.builder.model.DefaultRobotBuilder;
import com.example.designpatternstudy.builder.model.DetailRobotSkill;
import com.example.designpatternstudy.builder.model.RobotBuilder;
import com.example.designpatternstudy.builder.model.SkillLevel;
import java.time.LocalDate;

public class RobotDirector {

  private final RobotBuilder robotBuilder;

  public RobotDirector(RobotBuilder robotBuilder) {
    this.robotBuilder = robotBuilder;
  }

  public DefaultRobotBuilder createAttackRobot() {
    return robotBuilder
        .name("공격 로봇")
        .createDate(LocalDate.now())
        .addSkill(new DetailRobotSkill("공격", SkillLevel.HIGH))
        .addSkill(new DetailRobotSkill("방어", SkillLevel.ROW))
        .getDefaultRobot();
  }

  public DefaultRobotBuilder createGuardRobot() {
    return robotBuilder
        .name("방어 로봇")
        .createDate(LocalDate.now())
        .addSkill(new DetailRobotSkill("공격", SkillLevel.ROW))
        .addSkill(new DetailRobotSkill("방어", SkillLevel.HIGH))
        .getDefaultRobot();
  }
}
