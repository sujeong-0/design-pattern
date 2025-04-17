package com.deepdive.designpattern.singleton;

/**
 * 이 클래스는 싱글톤 패턴의 구현을 담당합니다.
 */
public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	// 이외의 메서드
}
