package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 청동 오리의 구현 담당합니다.
 */
public class MallardDuck  extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyByWings();

	}

	@Override
	void fly() {
		flyBehavior.fly();
	}

	@Override
	void quack() {
		quackBehavior.quack();
	}

	@Override
	public void display() {
		System.out.println("청둥 오리 모습");
	}

}
