package com.deepdive.designpattern.decorator.basic;

/**
 * 이 클래스는 데코레이터의 정의를 담당합니다.
 */
public abstract class Decorator extends Component{

	public final Component component;

	public Decorator(Component component) { //꾸며질 대상을 의미한다.
		this.component = component;
	}
}
