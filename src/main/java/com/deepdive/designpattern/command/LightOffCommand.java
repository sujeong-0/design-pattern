package com.deepdive.designpattern.command;

/**
 * 이 클래스는 전구의 전원 켜는 명령을 담당합니다.
 */
public class LightOffCommand implements Command{
	private final Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
}
