package com.parking.lot;

import com.parking.lot.vehicle.repository.Car;
import com.parking.lot.vehicle.repository.MotorBike;

public class Test {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot(20, 50, 30, 10);
		parkingLot.addSmallSpot(1001);
		parkingLot.addSmallSpot(1002);
		parkingLot.addSmallSpot(1003);
		parkingLot.addMediumSpot(2001);
		parkingLot.addMediumSpot(2002);
		parkingLot.addMediumSpot(2003);
		parkingLot.addMediumSpot(2004);
		parkingLot.addLargeSpot(3001);
		parkingLot.addXLargeSpot(4001);
		
		try {
			parkingLot.addCar(new Car("JAGUAR"));
			parkingLot.addCar(new MotorBike("MOTO G1"));
			parkingLot.addCar(new MotorBike("MOTO G2"));
			parkingLot.addCar(new MotorBike("MOTO G3"));
			parkingLot.addCar(new MotorBike("MOTO G4"));
			parkingLot.addCar(new MotorBike("MOTO G5"));
			parkingLot.addCar(new Car("HONDA"));
			parkingLot.addCar(new Car("BMW"));
			parkingLot.removeCar("MOTO G2");
			parkingLot.removeCar("MOTO G1");
			parkingLot.removeCar("MOTO G3");
			parkingLot.addCar(new Car("AUDI1"));
			parkingLot.addCar(new Car("AUDI2"));
			parkingLot.addCar(new Car("AUDI3"));
		} catch (Exception e) {
			System.out.println("No spot available, please try at Manish Parking Lot");
		}
	}

}
