package com.deepdive.designpattern.decorator.before;

/**
 * 이 클래스는 메인 클래스를 담당합니다.
 */
public class Main {

	public static void main(String[] args) {

		Americano iceAmericano = new Americano();
		iceAmericano.setIce(true);
		System.out.println("아이스 아메리카노 : " + iceAmericano.cost());

		Americano hotAmericano = new Americano();
		hotAmericano.setIce(false);
		System.out.println("핫 아메리카노 : " + hotAmericano.cost());


	}

}
