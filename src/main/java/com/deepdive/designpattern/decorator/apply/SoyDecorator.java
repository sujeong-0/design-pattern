package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 두유로 변경을 담당합니다.
 */
public class SoyDecorator extends Decorator{
	private int addCost = 4;

	public SoyDecorator( Beverage origin) {
		super(origin.getDescription() + "의 우유를 두유로 변경", origin);
	}

	@Override
	public int cost() {
		return origin.cost() + addCost;
	}
}
