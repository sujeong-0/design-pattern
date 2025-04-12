package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 에스프레소를 담당합니다.
 */
public class Espresso extends Beverage{
	private final int cost = 3;

	public Espresso() {
		super("에스프레소 샷");
	}

	@Override
	public int cost() {
		return this.cost;
	}
}
