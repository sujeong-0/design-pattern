package com.deepdive.designpattern.observer.apply;

import lombok.ToString;

/**
 * 이 클래스는 예측 내용 표현하는 디스플레이를 담당합니다.
 */
@ToString
public class ForecastDisplay implements Observer, DisplayElement{
	public ForecastDisplay(WeatherData weatherData) {
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
	/**
	 * 기압 값
	 */
	private int pressure = 0 ;

	@Override
	public void update() {

		this.pressure = weatherData.getPressure();
		this.humidity = weatherData.getHumidity();
		this.temperature= weatherData.getTemperature();

		// 예측하는 알고리즘 대신
		this.humidity += 1;
		this.temperature -= 3;
		this.pressure += 2;

		display();
	}

	@Override
	public void display() {
		System.out.println("forecast --- 기압 = [" + this.pressure + "] 습도 = [" + this.humidity +"] 온도 = ["+ this.temperature +"]");
	}
}
