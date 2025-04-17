package com.deepdive.designpattern.factory.before;

/**
 * 이 클래스는 main을 담당합니다.
 */
public class Main {

	public static void main(String[] args) {

		// client 코드

		Product a = new Product("A", "black", "-", "100");
		System.out.println(a + " 생성!");

		Product b = new Product("B", "white", "가벼움", "500");
		System.out.println(b + " 생성!");

		// 이후 새로운 타입이 추가되거나, 기존 product의 내용이 변경된다면 client의 내용을 수정해야 한다.
	}

}
