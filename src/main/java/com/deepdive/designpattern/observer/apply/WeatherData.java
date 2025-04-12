package com.deepdive.designpattern.observer.apply;

import lombok.Getter;

/**
 * 이 클래스는 weatherData 클래스를 담당합니다.
 *
 * <p> 기상 스테이션에서 센서의 값이 바뀌면 호출될 특정 메서드를 포함하고 있습니다.
 */

public class WeatherData implements Subject{

	/**
	 * 기압 값
	 */
	@Getter
	private int pressure = 0;
	/**
	 * 습도 값
	 */
	@Getter
	private int humidity = 0;
	/**
	 * 온도 값
	 */
	@Getter
	private int temperature = 0;


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
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(); // 데이터 전달
		}
	}

	/**
	 * 기상 스테이션에서 센서의 값이 갱신되면 호출될 메서드
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * 기상 스테이션에서 값을 가져오는 메서드
	 * 이 방법 외에 다른 방법으로 가져오는 것도 가능하지만, 테스트가 용이하도록 setter로 작성
	 * @param pressure 기압
	 * @param humidity 습도
	 * @param temperature 온도
	 */
	public void setData(int pressure, int humidity, int temperature) {
		this.pressure = pressure;
		this.humidity = humidity;
		this.temperature = temperature;
		measurementsChanged();
	}
}
