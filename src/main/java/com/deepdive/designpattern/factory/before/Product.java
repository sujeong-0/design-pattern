package com.deepdive.designpattern.factory.before;

import lombok.ToString;

/**
 * 이 클래스는 상품 담당합니다.
 */
@ToString
public class Product {
	public final String name;
	public final String color;
	public final String option;
	public final String price;


	public Product(String name, String color, String option, String price) {
		this.name = name;
		this.color = color;
		this.option = option;
		this.price = price;
	}
}
