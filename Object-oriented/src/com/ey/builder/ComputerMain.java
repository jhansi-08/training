package com.ey.builder;


public class ComputerMain {

	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder("Intel i7", 16,512).build();
		System.out.println(comp);
		
		Computer comp2 = new Computer.ComputerBuilder("Intel i5", 32, 512).setSsd(128).build();
		System.out.println(comp2);
		
		Computer comp3 = new Computer.ComputerBuilder("Intel i3", 16, 512).setSsd(128).setGpu("Nvidia").build();
		System.out.println(comp2);
	}
	
	
}
