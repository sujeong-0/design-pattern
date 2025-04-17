package com.deepdive.designpattern.factory.after;


/**
 * 이 클래스는 main을 담당합니다.
 */
public class Main {

	public static void main(String[] args) {

		Creator creatorA = new ConcreteCreatorA();
		Creator creatorB = new ConcreteCreatorB();

		Product productA = creatorA.createProduct();
		System.out.println(productA);
		Product productB = creatorB.createProduct();
		System.out.println(productB);
	}
}
