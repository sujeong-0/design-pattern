package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 []를 담당합니다.
 */
public abstract class Decorator extends Beverage{
	public final Beverage origin;

	public Decorator(String description, Beverage origin) {
		super(description);
		this.origin=origin;
	}
	public abstract int cost();
}
