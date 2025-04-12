package com.deepdive.designpattern.decorator.basic;

/**
 * 이 클래스는 컴포넌트를 담당합니다.
 * 컴포넌트는 Decorator 를 이용해 꾸며질 수 있습니다.
 */
public abstract class Component {
	public abstract int methodA();
	public abstract void methodB();
}
