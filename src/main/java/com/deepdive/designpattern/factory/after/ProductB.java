package com.deepdive.designpattern.factory.after;


import lombok.ToString;

/**
 * 이 클래스는 실제 Product를 담당합니다.
 */
@ToString
public class ProductB extends Product {

	protected ProductB() {
		super("B", "white", "가벼움", "500");
	}
}
