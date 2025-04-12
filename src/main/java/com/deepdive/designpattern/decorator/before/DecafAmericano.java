package com.deepdive.designpattern.decorator.before;

import lombok.Setter;
import lombok.ToString;

/**
 * 이 클래스는 디카페인 아메리카노를 담당합니다.
 */
@ToString
@Setter
public class DecafAmericano extends Beverage{

	private final int cost = 10;
	private boolean addWhip = false;
	private boolean isIce = false;

	public DecafAmericano() {
		super("디카페인 아메리카노 입니다.");
	}

	@Override
	public int cost() {
		int total = cost;
		if (addWhip) {
			total += 5;
		}
		if (isIce) {
			total += 5;
		}
		return total;
	}
}
