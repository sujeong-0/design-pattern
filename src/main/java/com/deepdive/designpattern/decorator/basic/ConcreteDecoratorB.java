package com.deepdive.designpattern.decorator.basic;

/**
 * 이 클래스는 구현된 데코레이터를 담당합니다.
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public int methodA() {
		int res = this.component.methodA();
		res += 10;
		System.out.println( " + 10를 함");
		return res;
	}

	@Override
	public void methodB() {
		this.component.methodB();
	}
}
