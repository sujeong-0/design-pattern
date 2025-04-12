package com.deepdive.designpattern.decorator.before;

import lombok.Setter;
import lombok.ToString;

/**
 * 이 클래스는 따듯한 모카라떼를 담당합니다.
 */
@ToString
@Setter
public class EspressoWithSteamMilkandMocha extends Beverage{
	private final int cost = 30;
	private boolean addWhip = false;

	public EspressoWithSteamMilkandMocha() {
		super("따듯한 모카 라떼입니다.");
	}

	@Override
	public int cost() {
		int total = cost;
		if (addWhip) {
			total += 5;
		}
		return total;
	}
}
