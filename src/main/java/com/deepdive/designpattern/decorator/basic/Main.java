package com.deepdive.designpattern.decorator.basic;

/**
 * 이 클래스는 메인을 담당합니다.
 */
public class Main {

	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteComponent();
		System.out.println("1. 원래 A : " + component.methodA());
		System.out.println();
		System.out.println();

		ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
		System.out.println("2. A로 꾸며진 A : " + decoratorA.methodA());
		System.out.println();
		System.out.println();

		ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);
		System.out.println("3. B로 꾸며진 A : " + decoratorB.methodA());
		System.out.println();
		System.out.println();

		ConcreteDecoratorB decoratorAB = new ConcreteDecoratorB(decoratorA);
		System.out.println("4. A와 B로 꾸며진 A : " + decoratorAB.methodA());

		System.out.println();
		System.out.println();

		Decorator decorator = new ConcreteDecoratorB(new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteDecoratorB(decoratorA))));
		System.out.println("5. A와 B로 여러번 꾸며진 A : " + decorator.methodA());
		System.out.println();
		System.out.println();

		System.out.println("6. 원본은 변하지 않음 : " + component.methodA());
		System.out.println();
		System.out.println();

		component.setOrigin(1);
		System.out.println("7. 만약 component 의 값을 변경하면 : " + component.methodA());
		System.out.println();
		System.out.println();

		ConcreteDecoratorA newDecoratorA = new ConcreteDecoratorA(component);
		System.out.println("8. A로 꾸며진 A : " + decoratorA.methodA());
		System.out.println();
		System.out.println();

		ConcreteDecoratorB newDecoratorB = new ConcreteDecoratorB(component);
		System.out.println("9. B로 꾸며진 A : " + newDecoratorB.methodA());
		System.out.println();
		System.out.println();

		ConcreteDecoratorB newDecoratorAB = new ConcreteDecoratorB(newDecoratorA);
		System.out.println("10. A와 B로 꾸며진 A : " + newDecoratorAB.methodA());

		System.out.println();
		System.out.println();

		Decorator newDecorator = new ConcreteDecoratorB(new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteDecoratorB(newDecoratorA))));
		System.out.println("11. A와 B로 여러번 꾸며진 A : " + newDecorator.methodA());


	}
}
