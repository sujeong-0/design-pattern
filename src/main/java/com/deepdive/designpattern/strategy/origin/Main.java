package com.deepdive.designpattern.strategy.origin;

/**
 * 이 클래스는 메인 클래스를 담당합니다.
 */
public class Main {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();

		System.out.println("Mallard duck---");
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.swim();

		System.out.println("rubberDuck duck---");
		rubberDuck.display();
		rubberDuck.quack();
		rubberDuck.swim();

		System.out.println("redHeadDuck duck---");
		redHeadDuck.display();
		redHeadDuck.quack();
		redHeadDuck.swim();
	}
}
