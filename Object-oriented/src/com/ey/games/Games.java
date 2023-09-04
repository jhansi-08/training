package com.ey.games;

public class Games {
	
	private int gameNo;
	private String name;
	private String type;
	
	private static int counter=1;
	
	public Games() {

		System.out.println("Games Constructor Loading....");
	}
	
	public Games(String name, String type) {
	
		this.gameNo = counter++;
		this.name = name;
		this.type = type;
	}
		

	public int getGameNo() {
		return gameNo;
	}

	public void setGameNo(int gameNo) {
		this.gameNo = gameNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Games.counter = counter;
	}

	@Override
	public String toString() {
		return "Games [gameNo=" + gameNo + ", name=" + name + ", type=" + type + "]";
	}
	
	

//	public void print() {
//		
//		System.out.println("Game No. = " + gameNo);
//		System.out.println("Name = " + name);
//		System.out.println("Type = " + type);
//		
//	}
	
	

}
