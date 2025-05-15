package com.deepdive.designpattern.command;

/**
 * 이 클래스는 CD player의 on 명령을 담당합니다.
 */
public class PlayerOffWithCDCommand implements Command{
	private final PlayerWithCD player;

	public PlayerOffWithCDCommand(PlayerWithCD player) {
		this.player = player;
	}

	@Override
	public void execute() {
		player.setVolume(0);
		player.setName("");
		player.off();
	}
}
