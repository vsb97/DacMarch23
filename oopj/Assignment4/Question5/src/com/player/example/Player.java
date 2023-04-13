package com.player.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Player {
	
	 String name;
	 int age;
	 String team;
	 int score;
	
	public void play(){}
	
	void printScore() {
		System.out.println("Sores.:"+score);
	}

}
