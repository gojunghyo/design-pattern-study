package com.example.designpatternstudy.builder;

import com.example.designpatternstudy.builder.delegate.RobotDirector;
import com.example.designpatternstudy.builder.model.DefaultRobotBuilder;
import com.example.designpatternstudy.builder.model.DetailRobotSkill;
import com.example.designpatternstudy.builder.model.SkillLevel;
import java.time.LocalDate;

public class MainBuilderApp {

  public static void main(String[] args) {

    DefaultRobotBuilder defaultRobot = new DefaultRobotBuilder()
        .name("방어형 로봇")
        .createDate(LocalDate.now())
        .addSkill(new DetailRobotSkill("공격", SkillLevel.MEDIUM))
        .addSkill(new DetailRobotSkill("방어", SkillLevel.HIGH))
        .getDefaultRobot();

    System.out.println(defaultRobot);

    System.out.println("--------------------------------------------------------------");
    // 위임객체인 Director 사용
    DefaultRobotBuilder attackRobot = new RobotDirector(new DefaultRobotBuilder()).createAttackRobot();
    System.out.println(attackRobot);

  }
}
