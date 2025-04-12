package com.deepdive.designpattern.observer.basic;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

	/** 등록된 옵저버 */
	List<Observer> observerList= new ArrayList<>();

	/**
	 * 옵저버로 등록하기
	 * @param observer 등록할 옵저버
	 */
	void registerObserver(Observer observer);

	/**
	 * 옵저버 목록에서 탈퇴하기
	 * @param observer 탈퇴할 옵저버
	 */
	void removeObserver(Observer observer);

	/**
	 * 옵저버들에게 내용 알리기
	 * @param content 알릴 내용
	 */
	void notifyObservers(Object content);
}
