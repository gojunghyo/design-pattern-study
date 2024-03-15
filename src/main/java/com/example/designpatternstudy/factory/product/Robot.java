package com.example.designpatternstudy.factory.product;

import com.example.designpatternstudy.factory.product.parts.Cpu;
import com.example.designpatternstudy.factory.product.parts.Memory;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
public class Robot implements RobotAction{

  private String name;

  private RobotType robotType;

  private Cpu cpu;

  private Memory memory;

  private LocalDate createDate;
  private LocalDate updateDate;

  @Override
  public void move() {
    System.out.println("로봇이 움직입니다.");
  }

  public static Robot of(String name, RobotType type) {
    return Robot.builder()
        .name(name)
        .robotType(type)
        .createDate(LocalDate.now())
        .build();
  }

  public Robot updateCPU(Cpu cpu) {
    this.cpu = cpu;
    this.updateDate = LocalDate.now();
    return this;
  }
}
