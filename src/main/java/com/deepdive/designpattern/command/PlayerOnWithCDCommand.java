package com.deepdive.designpattern.command;

/**
 * 이 클래스는 CD player의 on 명령을 담당합니다.
 */
public class PlayerOnWithCDCommand implements Command{
	private final PlayerWithCD player;

	public PlayerOnWithCDCommand(PlayerWithCD player) {
		this.player = player;
	}

	@Override
	public void execute() {
		player.setVolume(10);
		player.setName("1번 CD");
		player.on();
	}
}
