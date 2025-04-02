package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 삑삑 울음소리를 담당합니다.
 */
public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("삑삑");
	}

}
