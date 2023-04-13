package com.player.example;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class CricketPlayer extends Player{

	private int runsScored;
	private int wicketsTaken;
	
//	public CricketPlayer(String name, int age, String team, int score, int rs,int wt) {
//		super(name, age, team, score);
//		runsScored=rs;
//		wicketsTaken=wt;
//		// TODO Auto-generated constructor stub
//	}
	
	public CricketPlayer(String name, int age, String team, int score) {
		super(name, age, team, score);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void play() {
		//CricketPlayer cp = (CricketPlayer)this;
		System.out.println("inside cricket play");
		this.setScore(runsScored+wicketsTaken*10);
		System.out.println(this.getScore());
	}

}
