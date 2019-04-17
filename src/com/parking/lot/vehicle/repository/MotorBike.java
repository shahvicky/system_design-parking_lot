package com.parking.lot.vehicle.repository;

import com.parking.lot.size.Size;
import com.parking.lot.vehicle.Vehicle;

public class MotorBike implements Vehicle {
	String license;
	final Size size = Size.S;
	
	public MotorBike(String l) {
		license = l;
	}

	@Override
	public void setLicense(String l) {
		license = l;
	}

	@Override
	public String getLicense() {
		return license;
	}

	@Override
	public Size getSize() {
		return size;
	}
}
