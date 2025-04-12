package com.deepdive.designpattern.decorator.basic;

/**
 * 이 클래스는 구현된 데코레이터를 담당합니다.
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public int methodA() {
		int res = this.component.methodA();
		res += 5;
		System.out.println( " + 5를 함");
		return res;
	}

	@Override
	public void methodB() {
		this.component.methodB();
	}
}
