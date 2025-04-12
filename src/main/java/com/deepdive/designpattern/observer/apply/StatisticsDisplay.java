package com.deepdive.designpattern.observer.apply;

import lombok.ToString;

/**
 * 이 클래스는 통계 내용 표현하는 디스플레이를 담당합니다.
 *
 * <p>현재의 습도와 온도만 표시합니다.
 */
@ToString
public class StatisticsDisplay implements Observer, DisplayElement{
	/** 최고값 인덱스 */
	private int MAX =0;
	/** 최저값 인덱스 */
	private int MIN =1;
	/** 총 합 인덱스 */
	private int SUM =2;
	/** 개수 인덱스 */
	private int COUNT =3;

	/**
	 * 기압 값
	 */
	private int[] pressures = new int[4];
	/**
	 * 습도 값
	 */
	private int[] humidities = new int[4];
	/**
	 * 온도 값
	 */
	private int[] temperatures= new int[4];


	@Override
	public void update(int pressure, int humidity, int temperature) {
		if (pressures[MIN] > pressure || pressures[COUNT] ==0  ) {
			pressures[MIN] = pressure;
		}
		if (pressures[MAX] < pressure) {
			pressures[MAX] = pressure;
		}
		pressures[SUM] += pressure;
		pressures[COUNT]++;


		if (humidities[MIN] > humidity || humidities[COUNT] ==0 ) {
			humidities[MIN] = humidity;
		}
		if (humidities[MAX] < humidity) {
			humidities[MAX] = humidity;
		}
		humidities[SUM] += humidity;
		humidities[COUNT]++;


		if (temperatures[MIN] > temperature || temperatures[COUNT] ==0 ) {
			temperatures[MIN] = temperature;
		}
		if (temperatures[MAX] < temperature) {
			temperatures[MAX] = temperature;
		}
		temperatures[SUM] += temperature;
		temperatures[COUNT]++;
		display();
	}

	@Override
	public void display() {
		System.out.println("statistic --- 온도 최저= [" + temperatures[MIN] + "] 최고 = [" + temperatures[MAX] +"] 평균 = ["+ (temperatures[SUM] / temperatures[COUNT]) +"]");
		System.out.println("statistic --- 습도 최저= [" + humidities[MIN] + "] 최고 = [" + humidities[MAX] +"] 평균 = ["+ (humidities[SUM] / humidities[COUNT]) +"]");
		System.out.println("statistic --- 기압 최저= [" + pressures[MIN] + "] 최고 = [" + pressures[MAX] +"] 평균 = ["+ (pressures[SUM] / pressures[COUNT]) +"]");
	}
}
