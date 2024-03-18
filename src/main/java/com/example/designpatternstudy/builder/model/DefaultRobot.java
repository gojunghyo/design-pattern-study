package com.example.designpatternstudy.builder.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class DefaultRobot {

  private String name;

  private LocalDate createDate;

  private List<DetailRobotSkill> robotSkillList;
}
