package com.deepdive.designpattern.strategy.origin;

/**
 * 이 클래스는 고무 오리의 구현을 담당합니다.
 */
public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("노란 고무 오리");
	}

	@Override
	public void swim() {
		System.out.println("둥둥 떠다님");
	}

	@Override
	public void quack() {
		System.out.println("삑삑");
	}
}
