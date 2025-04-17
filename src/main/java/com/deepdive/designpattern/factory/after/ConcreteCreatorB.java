package com.deepdive.designpattern.factory.after;


/**
 * 이 클래스는 ProductB의 실제 생성을 담당합니다.
 */
public class ConcreteCreatorB implements Creator {

	@Override
	public Product factoryMethod() {
		System.out.println("product B를 생성하는 유일한 과정");
		return new ProductB();
	}
}
