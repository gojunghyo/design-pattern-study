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


### Builder Pattern
```
1. RobotBuilder를 구현한 DefaultRobotBuilder에서 체이닝 방식으로 필드를 주입받습니다.
2. getDefaultRobot() 메서드를 통해서 DefaultRobotBuilder를 생성합니다.
3. RobotDirector 에게 DefaultRobotBuilder 생성을 위임하여 RobotBuilder를 의존성주입 (DI) 한후 attackRobot 과 guardRobot을 생성하게 됩니다.
```
![robot_builder_pattern](https://github.com/gojunghyo/design-pattern-study/assets/128199051/386f981e-f682-4388-bfed-ec261efaf173)


### Adapter Pattern
```
1. 수정할수없는 라이브러리 (spring security) 의 UserDetails, UserDetailsService 인터페이스가 존재할때
2. 두 인터페이스를 구현한 다른 객체 MemberDetails, MemberDetailsService 를 두고
3. MeberService 에서 Member 를 생성하는 메소드를 만듭니다.
4. MemberDetailsService 는 MeberService 를 주입받아서 Member를 만듭니다.
5. LoginHandler 에서 MemberDetailsService 를 주입받아서 Member 를 Return 해줍니다.
6. 이처럼 수정할수없는 라이브러리가 존재할때 어댑터 패턴을 이용해서 OCP 를 준수하며 변경이 가능하도록 만드는 디자인 패턴입니다.

```
![adapter_pattern](https://github.com/gojunghyo/design-pattern-study/assets/128199051/b37b4e37-9062-4ca7-8cd1-7fcab1f93027)


### Composite Pattern
```
1. 전체와 개별 객체를 동일하게 처리할수 있는 패턴입니다.
2. Egg, Grape 라는 개별 상품이 존재할때, 두객체의 공통 메서드인 getPrice 를 추상화하기위해서 ShoppingCartElement 인터페이스를 구현하게합니다.
3. 개별 상품의 상위 객체로서 ShoppingCart에서 상품들을 담아둘수있는 add() 메서드, 전체 상품가격 totalPrice() 메서드를 만듭니다.
4. 이처럼 전체나 일부이거나 동일하게 처리가 가능한것은 ShoppingCartElement에서 getPrice를 뽑아내었기 때문입니다.
```
![composite_design_pattern](https://github.com/gojunghyo/design-pattern-study/assets/128199051/f9d10778-8a2a-491c-b842-748d046052af)

