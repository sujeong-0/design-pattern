package com.deepdive.designpattern.decorator.before;

import lombok.Setter;
import lombok.ToString;

/**
 * 이 클래스는 아메리카노를 담당합니다.
 */
@ToString
@Setter
public class Americano extends Beverage{

	private final int cost = 5;
	private boolean addWhip = false;
	private boolean isIce = false;


	public Americano() {
		super("아메리카노 입니다.");
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
