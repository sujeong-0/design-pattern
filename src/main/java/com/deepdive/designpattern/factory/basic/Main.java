package com.deepdive.designpattern.factory.basic;

/**
 * 이 클래스는 메인을 담당합니다.
 */
public class Main {

	public static void main(String[] args) {
		Creator creatorA = new ConcreteCreatorA();
		Creator creatorB = new ConcreteCreatorB();

		Product productA = creatorA.createProduct();
		Product productB = creatorB.createProduct();
	}
}
