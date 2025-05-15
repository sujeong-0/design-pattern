package com.deepdive.designpattern.command;

/**
 * 이 클래스는 []를 담당합니다.
 */
public class main {

	public static void main(String[] args) {
		// 리모컨 생성
		RemoteControl remoteControl = new RemoteControl();

		// 각 리모컨에 명령어 저장
		Light yelloLight = new Light("노란전구");
		remoteControl.setCommand(0,new  LightOnCommand(yelloLight),new  LightOffCommand(yelloLight));

		Light blueLight = new Light("파란전구");
		remoteControl.setCommand(1,new  LightOnCommand(blueLight),new  LightOffCommand(blueLight));

		PlayerWithCD playerWithCD = new PlayerWithCD();
		remoteControl.setCommand(2, new PlayerOnWithCDCommand(playerWithCD), new PlayerOffWithCDCommand(playerWithCD));

		// 리모컨 실행
		remoteControl.onCommandEvent(0);
		remoteControl.offCommandEvent(0);
		remoteControl.onCommandEvent(1);
		remoteControl.offCommandEvent(1);
		remoteControl.onCommandEvent(2);
		remoteControl.offCommandEvent(2);

		// 저장안된 명령어 실행
		remoteControl.offCommandEvent(3);
	}
}
