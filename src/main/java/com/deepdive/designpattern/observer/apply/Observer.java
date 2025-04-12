package com.deepdive.designpattern.observer.apply;

public interface Observer {

	/**
	 * 주체의 상태가 바뀌었음을 알려주는 메서드
	 * @param pressure 기압
	 * @param humidity 습도
	 * @param temperature 온도
	 */
	void update(int pressure, int humidity, int  temperature);
}
