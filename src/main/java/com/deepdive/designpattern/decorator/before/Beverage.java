package com.deepdive.designpattern.decorator.before;

import lombok.Getter;

/**
 * 이 클래스는 음료의 정의를 담당합니다.
 *
 * 모든 음료들은 이 클래스를 상속받고, cost()를 재정의 해야합니다.
 */
public abstract class Beverage {

	@Getter
	private final  String description;

	public Beverage(String description) {
		this.description = description;
	}

	/**
	 * 가격을 계산합니다.
	 * @return 가격
	 */
	public abstract int cost();

}
