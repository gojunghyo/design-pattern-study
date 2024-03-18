package com.example.designpatternstudy.builder.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class DetailRobotSkill {

  private String skillName;

  private SkillLevel skillLevel;
}
