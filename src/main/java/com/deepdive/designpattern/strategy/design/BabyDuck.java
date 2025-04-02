package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 아기 오리의 정의를 담당합니다.
 */
public class BabyDuck extends Duck {
	public BabyDuck() {
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("노란 고무 오리");
	}

	@Override
	public void swim() {
		System.out.println("둥둥 떠다님");
	}

	@Override
	void fly() {
		flyBehavior.fly();
	}

	@Override
	public void quack() {
		quackBehavior.quack();
	}
}
