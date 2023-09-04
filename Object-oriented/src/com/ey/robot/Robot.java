package com.ey.robot;

public class Robot {

	private int robotNo;
	private String type;
	private String energy;
	private String function;
	
	private static int counter = 0;
	
	public Robot() {

		System.out.println("Constructor Loading....");
	
	}

	public Robot(String type, String energy, String function) {
		this.robotNo = counter++;
		this.type = type;
		this.energy = energy;
		this.function = function;
	}

	public int getRobotNo() {
		return robotNo;
	}

	public void setRobotNo(int robotNo) {
		this.robotNo = robotNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Robot.counter = counter;
	}

	@Override
	public String toString() {
		return "Robot [robotNo=" + robotNo + ", type=" + type + ", energy=" + energy + ", function=" + function + "]";
	}
	
	
}
