package com.deepdive.designpattern.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 이 클래스는 전구를 담당합니다.
 */
@Getter
@Setter
@ToString
public class Light {

	private String name;
	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println("전구 ["+this.name + "] 전원 ON");
	}

	public void off() {
		System.out.println("전구 ["+this.name + "] 전원 OFF");
	}
}
