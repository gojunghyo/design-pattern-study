# design-pattern-study

### Singleton Design Pattern
```
1. double checked locking
2. static inner class
```
```java
public class LocalUserV1 {

  // 1. double checkd locking
  private static volatile LocalUserV1 INSTANCE;

  public static LocalUserV1 getInstance() {
    if (INSTANCE == null) {
      synchronized (LocalUserV1.class) {
        if(INSTANCE == null) {
          INSTANCE = new LocalUserV1();
        }
      }
    }
    return INSTANCE;
  }

}
```
```java
public class LocalUserV2 {

  // 2. static inner class

  public static LocalUserV2 getInstance() {
    return LocalUserV2Holder.INSTANCE;
  }

  static class LocalUserV2Holder {
    private static final LocalUserV2 INSTANCE = new LocalUserV2();
  }

}
```



### Factory Method Design Pattern
```
1. 로봇 팩토리를 생성하는 부분과 제품인 로봇 프로덕트 부분으로 나뉘어집니다.
2. 팩토리에서는 OCP를 준수하여 확장에는 열려있으며, 변경에는 닫혀있습니다.
3. 추가적인 제품 M3Robot 생산요청이 들어오더라도 M1,M2 Factory에는 영향이 없으며
   M3Factory 클래스를 구현하여 확장할수있습니다.

RobotFactory 인터페이스 하위에는 AbstractRobotFactory를 중간계층으로 둠으로써 구체적인 생성은
하위 클래스에게 위임하였습니다.
```
![robot_factory](https://github.com/gojunghyo/design-pattern-study/assets/128199051/42a0c9d8-17b8-405c-9c02-0f985676098a)



### Abstract Factory Method Pattern
```
1. 로봇을 구현하는 여러 객체들중 CPU, Memory 속성 객체를 추상화 하여
   팩토리 메서드 패턴을 사용하여 구현합니다.
2. M1,M2 RobotFactory에서는 RobotPartsFactory 의존성을 주입받으며,
   RobotPartsFactory 에서는 cpu, memory 를 insert 해줍니다. 
```
![m1_factory](https://github.com/gojunghyo/design-pattern-study/assets/128199051/15e807a6-07b8-483b-a122-1fd52a5b0746)

