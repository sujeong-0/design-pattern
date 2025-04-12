package com.deepdive.designpattern.observer.basic;

public interface Observer {

	/**
	 * 주체의 상태가 바뀌었음을 알려주는 메서드
	 * @param object 바뀐 내용
	 */
	void update(Object object);
}
