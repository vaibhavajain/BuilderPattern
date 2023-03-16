package com.builder.builder;

import com.builder.components.CarType;
import com.builder.components.Engine;
import com.builder.components.GPSNavigator;
import com.builder.components.Transmission;
import com.builder.components.TripComputer;
import com.builder.product.Car;

public class CarBuilder implements Builder {

	private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    
	@Override
	public void setSeats(int seats) {
		this.seats = seats;

	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	@Override
	public void setCarType(CarType type) {
		this.type = type;
	}
	
	public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
