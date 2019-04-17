package com.parking.lot;

import java.util.HashMap;
import java.util.Stack;

import com.parking.lot.size.Size;
import com.parking.lot.spot.Spot;
import com.parking.lot.spot.repository.LargeSpot;
import com.parking.lot.spot.repository.MediumSpot;
import com.parking.lot.spot.repository.SmallSpot;
import com.parking.lot.spot.repository.XLargeSpot;
import com.parking.lot.vehicle.Vehicle;

public class ParkingLot {
	Stack<SmallSpot> smallSpots;
	Stack<MediumSpot> mediumSpots;
	Stack<LargeSpot> largeSpots;
	Stack<XLargeSpot> xLargeSpots;
	int small, medium, large, xLarge;
	HashMap<String, Spot> map = new HashMap<>();
	
	public ParkingLot(int s, int m, int l, int xl) {
		smallSpots = new Stack<SmallSpot>();
		mediumSpots = new Stack<MediumSpot>();
		largeSpots = new Stack<LargeSpot>();
		xLargeSpots = new Stack<XLargeSpot>();
		small = s;
		medium = m;
		large = l;
		xLarge = xl;
	}
	
	void addSmallSpot(long id) {
		smallSpots.add(new SmallSpot(id));
	}
	void addMediumSpot(long id) {
		mediumSpots.add(new MediumSpot(id));
	}
	void addLargeSpot(long id) {
		largeSpots.add(new LargeSpot(id));
	}
	void addXLargeSpot(long id) {
		xLargeSpots.add(new XLargeSpot(id));
	}
	
	private Spot getSmallSpot() throws Exception {
		if(smallSpots.isEmpty()) {
			return getMediumSpot();
		}
		return smallSpots.pop();
	}
	
	private Spot getMediumSpot() throws Exception {
		if(mediumSpots.isEmpty()) {
			return getLargeSpot();
		}
		return mediumSpots.pop();
	}
	
	private Spot getLargeSpot() throws Exception {
		if(largeSpots.isEmpty()) {
			return getXLargeSpot();
		}
		return largeSpots.pop();
	}
	
	private Spot getXLargeSpot() throws Exception {
		if(xLargeSpots.isEmpty()) {
			throw new Exception("no spot available");
		}
		return xLargeSpots.pop();
	}
	
	Spot addCar(Vehicle c) throws Exception {
		Spot s;
		if(c.getSize() == Size.S) {
			s = getSmallSpot();
		} else if(c.getSize() == Size.M) {
			s = getMediumSpot();
		} else if(c.getSize() == Size.L) {
			s = getLargeSpot();
		} else {
			s = getXLargeSpot();
		}
		System.out.println(s);
		map.put(c.getLicense(), s);
		return s;
	}
	
	void removeCar(String license) {
		Spot s = map.get(license);
		map.remove(license);
		if(s.getSize() == Size.S) {
			smallSpots.push((SmallSpot) s);
			System.out.println(smallSpots);
		} else if(s.getSize() == Size.M) {
			mediumSpots.push((MediumSpot) s);
			System.out.println(mediumSpots);
		} else if(s.getSize() == Size.L) {
			largeSpots.push((LargeSpot) s);
			System.out.println(largeSpots);
		} else {
			xLargeSpots.push((XLargeSpot) s);
			System.out.println(xLargeSpots);
		}
		
	}
	
}
