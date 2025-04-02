package com.deepdive.designpattern.strategy.origin;

/**
 * 이 클래스는 오리의 구현를 담당합니다.
 */
public class Duck {

	public void display() {
		System.out.println("오리 모습");
	}

	public void swim() {
		System.out.println("발을 이용해 헤엄침");
	}

	public void quack() {
		System.out.println("꽥꽥");
	}

}