package com.deepdive.designpattern.strategy.design;

/**
 * 이 클래스는 날지 못하는 행동을 담당합니다.
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("못날아요.");
	}
}
