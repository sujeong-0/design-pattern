package com.deepdive.designpattern.decorator.apply;

/**
 * 이 클래스는 메인 클래스를 담당합니다.
 */
public class Main {

	public static void main(String[] args) {

		Beverage latteSoy = new Espresso();
		latteSoy = new SoyDecorator(latteSoy);
		System.out.println(latteSoy.getDescription() + " - " + latteSoy.cost());

		Beverage DecafSoy = new Decaf();
		DecafSoy = new SoyDecorator(DecafSoy);
		System.out.println(DecafSoy.getDescription() + " - " + DecafSoy.cost());

		Beverage latteSoyDoubleMocha = new Espresso();
		latteSoyDoubleMocha = new SoyDecorator(latteSoyDoubleMocha);
		latteSoyDoubleMocha = new MochaDecorator(latteSoyDoubleMocha);
		latteSoyDoubleMocha = new MochaDecorator(latteSoyDoubleMocha);
		System.out.println(latteSoyDoubleMocha.getDescription() + " - " + latteSoyDoubleMocha.cost());
	}

}
