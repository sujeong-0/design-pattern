package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 울지 않는 울음소리를 담당합니다.
 */
public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("(무음)");
	}

}
