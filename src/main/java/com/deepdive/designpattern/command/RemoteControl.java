package com.deepdive.designpattern.command;

/**
 * 이 클래스는 리모컨을 담당합니다.
 */
public class RemoteControl {
	// 리모컨의 슬롯
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();


		// 기본 설정은 아무런 명령이 없음으로 초기화
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	/**
	 * 슬롯에 명령어 저장
	 * @param slot 슬롯 번호
	 * @param onCommand on 명령어
	 * @param offCommand off 명령어
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	// 리모컨의 on 버튼
	public void onCommandEvent(int slot) {
		onCommands[slot].execute();
	}

	// 리모컨의 off 버튼
	public void offCommandEvent(int slot) {
		offCommands[slot].execute();
	}

}
