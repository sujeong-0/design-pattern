package com.deepdive.designpattern.strategy.origin;

/**
 * 이 클래스는 빨간 머리 오리의 구현을 담당합니다.
 */
public class RedHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("빨간 머리 오리 모습");
	}
}
