package com.example.designpatternstudy.prototype.flaw;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class RobotFlawHistories {

  public Integer sequence;

  private String name;

  private FlawLevel level;

  private LocalDate createDate;


}
