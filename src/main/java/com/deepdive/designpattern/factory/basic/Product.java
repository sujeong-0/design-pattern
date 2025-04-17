package com.deepdive.designpattern.factory.basic;

/**
 * 이 클래스는 추상 product를 담당합니다.
 */
public abstract class Product {

	public final String name;

	protected Product(String name) {
		this.name = name;
	}
}
