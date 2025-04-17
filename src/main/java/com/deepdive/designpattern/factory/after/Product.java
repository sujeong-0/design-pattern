package com.deepdive.designpattern.factory.after;

/**
 * 이 클래스는 추상 product를 담당합니다.
 */
public abstract class Product {

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
