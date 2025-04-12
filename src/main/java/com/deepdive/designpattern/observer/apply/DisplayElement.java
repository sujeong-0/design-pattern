package com.deepdive.designpattern.observer.apply;

/**
 * 이 클래스는 디스플레이에 데이터를 표현하는 행동을 캡슐화하는 것을 담당합니다.
 */
public interface DisplayElement {

	/**
	 * 가지고 있는 값을, 화면에 적절히 표시
	 */
	void display();
}
