package com.deepdive.designpattern.observer.basic;

import lombok.ToString;

/**
 * 이 클래스는 옵저버로 등록된 임시 객체를 담당합니다.
 */
@ToString
public class ConcreteObserver implements Observer {

	/** 클래스를 구분하기 위한 값 */
	private final String  className;

	/** 내용 */
	private Object  content;

	public ConcreteObserver(String className) {
		this.className = className;
	}
	@Override
	public void update(Object object) {
		this.content = object;
		System.out.println("주제의 내용이 변경되었음을 옵저버가 알게됨, 바뀐 내용 : " +object);
	}
}
