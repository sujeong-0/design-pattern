package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 꽥괙 울음소리를 담당합니다.
 */
public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("꽥꽥");
	}

}
