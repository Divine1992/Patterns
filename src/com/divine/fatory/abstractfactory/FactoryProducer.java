package com.divine.fatory.abstractfactory;

public class FactoryProducer {

	private FactoryProducer() {
	}

	public static VehicleFactory getFactory(VehicleType vehicleType) {
		switch (vehicleType) {
		case AIRPLANE:
			return new AirplaneFactory();
		case CAR:
			return new CarFactory();
		}
		return null;
	}
}
