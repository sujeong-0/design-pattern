package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 메인 클래스를 담당합니다.
 */
public class Main {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck rubberDuck = new RubberDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck babyDuck = new BabyDuck();

		System.out.println("Mallard duck---");
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.fly();
		mallardDuck.swim();
		System.out.println("rubberDuck duck---");
		rubberDuck.display();
		rubberDuck.quack();
		rubberDuck.fly();
		rubberDuck.swim();
		System.out.println("redHeadDuck duck---");
		redHeadDuck.display();
		redHeadDuck.quack();
		redHeadDuck.fly();
		redHeadDuck.swim();
		System.out.println("baby duck---");
		babyDuck.display();
		babyDuck.quack();
		babyDuck.fly();
		babyDuck.swim();

		System.out.println("---------babyDuck 진화중--------");
		babyDuck.setFlyBehavior(new FlyByWings());
		System.out.println("---------babyDuck fly 능력 얻음!--------");
		babyDuck.fly();
	}
}
