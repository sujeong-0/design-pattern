package com.deepdive.designpattern.decorator.basic;

import lombok.Setter;

/**
 * 이 클래스는 실제 꾸며질 대상의 정의를 담당합니다.
 */
public class ConcreteComponent extends Component{
	@Setter
	int origin = 10;

	@Override
	public int methodA() {
		// 실제 내용 추가
		return origin;
	}

	@Override
	public void methodB() {
		System.out.println("ConcreteComponent의 메서드 B");
	}
}
