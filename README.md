# design-pattern-study

### Singleton Design Pattern
```
1. double checked locking
2. static inner class
```
1. ![Double](https://github.com/gojunghyo/design-pattern-study/assets/128199051/6a195cb5-6750-4780-a8bd-0914c96d667f)

2. ![statis_inner](https://github.com/gojunghyo/design-pattern-study/assets/128199051/a21abb44-7f7a-4f02-af1a-217665bd3d27)


### Factory Method Design Pattern
```
1. 로봇 팩토리를 생성하는 부분과 제품인 로봇 프로덕트 부분으로 나뉘어집니다.
2. 팩토리에서는 OCP를 준수하여 확장에는 열려있으며, 변경에는 닫혀있습니다.
3. 추가적인 제품 M3Robot 생산요청이 들어오더라도 M1,M2 Factory에는 영향이 없으며
   M3Factory 클래스를 구현하여 확장할수있습니다.
```
![robot_factory](https://github.com/gojunghyo/design-pattern-study/assets/128199051/42a0c9d8-17b8-405c-9c02-0f985676098a)
