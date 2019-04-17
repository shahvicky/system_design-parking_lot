package com.parking.lot.vehicle;

import com.parking.lot.size.Size;

public interface Vehicle {
	
	void setLicense(String l);
	String getLicense();
	Size getSize();
}
