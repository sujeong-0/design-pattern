package com.deepdive.designpattern.observer.apply;


/**
 * 이 클래스는 메인 클래스를 담당합니다.
 */
public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay display2 = new StatisticsDisplay(weatherData);
		ForecastDisplay display3 = new ForecastDisplay(weatherData);


		System.out.println("--- 옵저버 등록 ---");
		weatherData.registerObserver(display1);
		weatherData.registerObserver(display2);
		weatherData.registerObserver(display3);
		System.out.println();
		System.out.println();

		System.out.println("--- 1번째 내용 등록--- 기압 1 / 습도 20 / 온도 10");
		weatherData.setData(1, 20, 10);
		System.out.println();
		System.out.println();
		System.out.println("--- 2번째 내용 등록--- 기압 1 / 습도 25 / 온도 12");
		System.out.println();
		System.out.println();
		weatherData.setData(1, 25, 12);
		System.out.println();
		System.out.println();
		System.out.println("--- 디스플레이 3 제거---");
		weatherData.removeObserver(display3);

		System.out.println();
		System.out.println();
		System.out.println("--- 3번째 내용 등록--- 기압 1 / 습도 30 / 온도 13");
		weatherData.setData(1, 30, 13);
		System.out.println("삭제된 디스플레이 3의 내용 : "+ display3);

	}
}
