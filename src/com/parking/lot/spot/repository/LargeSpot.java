package com.parking.lot.spot.repository;

import com.parking.lot.size.Size;
import com.parking.lot.spot.Spot;

public class LargeSpot implements Spot {
	long id;
	final Size size = Size.L;
	boolean bookedStatus;
	
	public LargeSpot() {
		bookedStatus = false;
	}
	
	public LargeSpot(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public Size getSize() {
		return size;
	}

	@Override
	public boolean isBooked() {
		return bookedStatus;
	}

	@Override
	public void bookSlot() {
		bookedStatus = true;
	}

	@Override
	public String toString() {
		return "LargeSpot [id=" + id + ", size=" + size + ", bookedStatus=" + bookedStatus + "]";
	}

}
