package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 날개로 나는 동작 구현을 담당합니다.
 */
public class FlyByWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날개로 날기");
	}
}
