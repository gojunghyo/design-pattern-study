package com.example.designpatternstudy.prototype.flaw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RobotFlaw implements Cloneable {

  private long id;

  private String title;

  public List<RobotFlawHistories> robotFlawHistories;

  public List<RobotFlawHistories> getFlawLevelHistories(FlawLevel level) {

    List<RobotFlawHistories> result = this.robotFlawHistories.stream()
        .filter(data -> data.getLevel() == level)
        .collect(Collectors.toList());

    return result;
  }


  @Override
  public Object clone() throws CloneNotSupportedException {
    // Deep Copy
    List<RobotFlawHistories> lists = new ArrayList<>();
    this.robotFlawHistories.forEach(data ->
        lists.add(new RobotFlawHistories(data.sequence, data.getName(), data.getLevel(), data.getCreateDate())));

    RobotFlaw robotFlaw = new RobotFlaw();
    robotFlaw.setId(this.id);
    robotFlaw.setTitle(this.title);
    robotFlaw.setRobotFlawHistories(lists);
    return robotFlaw;
    
    // Shallow copy
    // return super.clone();
  }


}
