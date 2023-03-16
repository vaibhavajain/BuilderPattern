package com.builder.builder;

import com.builder.components.CarType;
import com.builder.components.Engine;
import com.builder.components.GPSNavigator;
import com.builder.components.Transmission;
import com.builder.components.TripComputer;

public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}
