package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 디카페인을 담당합니다.
 */
public class Decaf extends Beverage{
	private final int cost = 10;

	public Decaf() {
		super("디카페인 샷");
	}

	@Override
	public int cost() {
		return this.cost;
	}
}
