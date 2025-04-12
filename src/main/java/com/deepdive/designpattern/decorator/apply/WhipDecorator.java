package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 휘핑 추가를 담당합니다.
 */
public class WhipDecorator extends Decorator{
	private int addCost = 3;

	public WhipDecorator( Beverage origin) {
		super(origin.getDescription() + "에 휘핑 추가", origin);
	}

	@Override
	public int cost() {
		return origin.cost() + addCost;
	}
}
