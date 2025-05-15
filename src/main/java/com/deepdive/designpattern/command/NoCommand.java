package com.deepdive.designpattern.command;

/**
 * 이 클래스는 명령 없음을 담당합니다.
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no command");
	}
}
