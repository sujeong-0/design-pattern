package com.deepdive.designpattern.observer.basic;

/**
 * 이 클래스는 주제 역할의 구현을 담당합니다.
 */
public class ConcreteSubject implements Subject{

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
		System.out.println("옵저버로 등록 : " + observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
		System.out.println("옵저버 목록에서 삭제 : " + observer);
	}

	@Override
	public void notifyObservers(Object content) {
		for (Observer observer : observerList) {
			observer.update(content);
			System.out.println(observer);
		}
	}
}
