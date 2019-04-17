package com.parking.lot.spot;

import com.parking.lot.size.Size;

public interface Spot {
	long getId();
	void setId(long id);
	Size getSize();
	boolean isBooked();
	void bookSlot();
}
