package com.deepdive.designpattern.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 이 클래스는 CD 플레이어를 담당합니다.
 */
@Setter
@Getter
@ToString
public class PlayerWithCD {

	private int volume;
	private String name;


	public void on() {
		System.out.println("CD 플레이어 전원 ON, CD 이름 ["+this.name + "], 볼륨 ["+this.name + "]");
	}

	public void off() {
		System.out.println("CD 플레이어 전원 OFF, CD 이름 ["+this.name + "], 볼륨 ["+this.name + "]");
	}
}
