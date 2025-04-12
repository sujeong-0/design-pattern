package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 모카 추가를 담당합니다.
 */
public class MochaDecorator extends Decorator{
	private int addCost = 5;

	public MochaDecorator( Beverage origin) {
		super(origin.getDescription() + "에 모카 추가", origin);
	}

	@Override
	public int cost() {
		return origin.cost() + addCost;
	}
}
