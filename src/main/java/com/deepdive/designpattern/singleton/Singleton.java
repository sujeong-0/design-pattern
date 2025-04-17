package com.deepdive.designpattern.singleton;

/**
 * 이 클래스는 싱글톤 패턴의 구현을 담당합니다.
 */
public class Singleton {

	private volatile static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {

		synchronized (Singleton.class) { // 처음에만 동기화 됨
			if (instance == null) {
				instance = new Singleton();
			}
		}
		return instance;
	}

	// 이외의 메서드
}
