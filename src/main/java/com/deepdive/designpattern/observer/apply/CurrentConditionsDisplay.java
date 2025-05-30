package com.deepdive.designpattern.observer.apply;

import lombok.ToString;

/**
 * 이 클래스는 현재 상태를 표현하는 디스플레이를 담당합니다.
 *
 * <p>현재의 습도와 온도만 표시합니다.
 */
@ToString
public class CurrentConditionsDisplay implements Observer, DisplayElement{

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	private final WeatherData weatherData;
	/**
	 * 습도 값
	 */
	private int humidity = 0;
	/**
	 * 온도 값
	 */
	private int temperature = 0;


	@Override
	public void update() {
		this.humidity = weatherData.getHumidity();
		this.temperature =  weatherData.getTemperature();
		display();
	}

	@Override
	public void display() {
		System.out.println("current --- 습도 = [" + humidity +"] 온도 = ["+ temperature +"]");
	}
}
