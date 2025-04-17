package com.deepdive.designpattern.singleton;

/**
 * 이 클래스는 싱글톤 패턴의 구현을 담당합니다.
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 이외의 메서드
}
