package com.player.example;

import lombok.Data;

@Data
public class FootballPlayer extends Player{

	private int goalsScored;
	private int assist;
	
//	public FootballPlayer(String name, int age, String team, int score, int gs, int assist) {
//		super(name, age, team, score);
//		goalsScored=gs;
//		this.assist=assist;
//		// TODO Auto-generated constructor stub
//	}
	
	public FootballPlayer(String name, int age, String team, int score) {
		super(name, age, team, score);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void play() {
		System.out.println("inside football play");
		this.setScore(goalsScored+assist*5);
		System.out.println(this.getScore());
	}

}
