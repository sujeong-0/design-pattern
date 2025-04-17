package com.deepdive.designpattern.factory.basic;

/**
 * 이 클래스는 ProductA의 실제 생성을 담당합니다.
 */
public class ConcreteCreatorA implements Creator{

	@Override
	public Product factoryMethod() {
		System.out.println("product A를 생성하는 유일한 과정");
		return new ProductA();
	}
}
