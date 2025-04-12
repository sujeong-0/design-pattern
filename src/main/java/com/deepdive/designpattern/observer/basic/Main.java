package com.deepdive.designpattern.observer.basic;

/**
 * 이 클래스는 메인 클래스를 담당합니다.
 */
public class Main {
	public static void main(String[] args) {
		ConcreteObserver observer1 = new ConcreteObserver("옵저버 1");
		ConcreteObserver observer2 = new ConcreteObserver("옵저버 2");
		ConcreteObserver observer3 = new ConcreteObserver("옵저버 3");

		ConcreteSubject subject = new ConcreteSubject();

		System.out.println("--- 옵저버 등록 ---");
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.registerObserver(observer3);

		System.out.println("--- 내용 1 등록---");
		subject.notifyObservers("1");
		System.out.println("--- 내용 2 변경---");
		subject.notifyObservers("2");
		System.out.println("--- 옵저버 3 제거---");
		subject.removeObserver(observer3);
		System.out.println("--- 내용 3 변경---");
		subject.notifyObservers("3");
		System.out.println("삭제된 옵저버3의 내용 : "+ observer3);

	}
}
