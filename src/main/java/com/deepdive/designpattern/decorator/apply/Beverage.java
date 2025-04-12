package com.deepdive.designpattern.decorator.apply;

import lombok.Getter;

/**
 * 이 클래스는 음료의 정의를 담당합니다.
 */
public abstract class Beverage {

	/**
	 * 음료 설명
	 */
	@Getter
	private final String description;


	public Beverage(String description) {
		this.description = description;
	}

	/**
	 * 가격을 알려줌
	 * @return 가격
	 */
	public abstract int cost();

}
