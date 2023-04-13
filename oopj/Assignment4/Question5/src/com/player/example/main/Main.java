package com.player.example.main;

import java.util.Scanner;

import com.player.example.CricketPlayer;
import com.player.example.FootballPlayer;
import com.player.example.PlayerTest;

public class Main {

	static PlayerTest pt = new PlayerTest();
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice;		
		for(int i=0;i<(PlayerTest.maxArrele);i++) {
			choice=Main.menuList();
			switch(choice) {
			case 1:Main.CricketInput(i);
				break;
			case 2:Main.footBallInput(i);
			break;
			}
		}
		
		for(int i=0;i<(PlayerTest.maxArrele);i++) {
			if((pt.p[i]) instanceof CricketPlayer) {
				CricketPlayer cp = (CricketPlayer) pt.p[i];
				System.out.println("Enter runsScored and wickets taken.:");
				cp.setRunsScored(sc.nextInt());
				cp.setWicketsTaken(sc.nextInt());
			}
			else {
					FootballPlayer cp = (FootballPlayer) pt.p[i];
					System.out.println("Enter goalsScored and assist.:");
					cp.setGoalsScored(sc.nextInt());
					cp.setAssist(sc.nextInt());
				
			}
			pt.p[i].play();
		}

	}

	private static void footBallInput(int i) {
		sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter age(int)");
		int age=sc.nextInt();
		System.out.println("enter team");
		sc.nextLine();
		String team = sc.nextLine();
		System.out.println("enter score(int)");
		int score = sc.nextInt();
		pt.p[i] = new FootballPlayer(name, age, team, score);
		
	}

	private static void CricketInput(int i) {
		sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter age(int)");
		int age=sc.nextInt();
		System.out.println("enter team");
		sc.nextLine();
		String team = sc.nextLine();
		System.out.println("enter score(int)");
		int score = sc.nextInt();
		pt.p[i] = new CricketPlayer(name, age, team, score);
		
	}

	private static int menuList() {
		System.out.println("1. CricketPlayer");
		System.out.println("2. FootballPlayer");
		System.out.print("Enter choise");
		return sc.nextInt();
	}

}
