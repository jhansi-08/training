package com.ey.adapter;

public class SpeedAdapter implements Nitro {

	private Turbo car;

	public SpeedAdapter(Turbo car) {
		this.car = car;
	}

	@Override
	public double getSpeedKms() {
		// TODO Auto-generated method stub
		return car.getSpeed() * 1.60;
	}

}
