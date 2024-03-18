package com.example.designpatternstudy.prototype;

import com.example.designpatternstudy.prototype.flaw.FlawLevel;
import com.example.designpatternstudy.prototype.flaw.RobotFlaw;
import com.example.designpatternstudy.prototype.flaw.RobotFlawHistories;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainProtoTypeApp {

  public static void main(String[] args) throws CloneNotSupportedException {
    RobotFlawHistories history = new RobotFlawHistories(1, "결함 히스토리 네임", FlawLevel.ROW,
        LocalDate.now());

    List<RobotFlawHistories> list = new ArrayList<>();
    list.add(history);

    RobotFlaw originFlaw = RobotFlaw.builder()
        .id(1L)
        .title("첫번째 결함")
        .robotFlawHistories(list)
        .build();

    System.out.println(originFlaw);

    // [shallow copy]
    RobotFlaw cloneFlaw = (RobotFlaw) originFlaw.clone();

    // 같은 주소를 바라보고 있습니다.
    System.out.println(originFlaw.robotFlawHistories == cloneFlaw.robotFlawHistories); // 쉘로우 카피시 true , 깃 커밋시 딥 카피로 넣어둠

    // 그렇기에 원본객체의 FlawHistory 변경시 Clone 객체도 영향을 받습니다.
    originFlaw.robotFlawHistories.get(0).sequence = 2;

    System.out.println(originFlaw.robotFlawHistories.get(0).sequence); // 2
    System.out.println(cloneFlaw.robotFlawHistories.get(0).sequence); // 쉘로우카피시 2, 딥 카피시 1

    // [deep copy]
    // 서로 다른 주소를 바라보고 있습니다.
    System.out.println(originFlaw.robotFlawHistories != cloneFlaw.robotFlawHistories); // 딥 카피시 같지 않다 true

  }

}
