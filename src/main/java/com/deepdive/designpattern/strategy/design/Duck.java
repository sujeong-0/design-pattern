package com.deepdive.designpattern.strategy.design;

import lombok.Setter;

/**
 * 이 클래스는 오리의 정의를 담당합니다.
 */
public abstract class Duck {

	// 나는 행동
	@Setter
	FlyBehavior flyBehavior;

	// 소리내는 행동
	QuackBehavior quackBehavior;

	abstract void fly();
	abstract void quack();

	void display(){
		System.out.println("오리의 모습을 보여줍니다.");
	}
	void swim(){
		System.out.println("오리가 헤엄칩니다.");
	}

}
