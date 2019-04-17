package com.parking.lot.spot.repository;

import com.parking.lot.size.Size;
import com.parking.lot.spot.Spot;

public class XLargeSpot implements Spot {
	long id;
	final Size size = Size.XL;
	boolean bookedStatus;
	
	public XLargeSpot() {
		bookedStatus = false;
	}
	
	public XLargeSpot(long id) {
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
		return "XLargeSpot [id=" + id + ", size=" + size + ", bookedStatus=" + bookedStatus + "]";
	}
}
