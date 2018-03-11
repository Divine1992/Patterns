package com.divine.factory.abstractfactory;

import com.divine.factory.abstractfactory.airplane.Airbus;
import com.divine.factory.abstractfactory.airplane.Airplane;
import com.divine.factory.abstractfactory.airplane.AirplaneType;
import com.divine.factory.abstractfactory.airplane.Boeing;
import com.divine.factory.abstractfactory.car.Car;
import com.divine.factory.abstractfactory.car.CarType;

public class AirplaneFactory extends VehicleFactory{

	@Override
	Car getCar(CarType carType) {
		return null;
	}

	@Override
	Airplane getPlane(AirplaneType airplaneType) {
		Airplane airplane;
		switch (airplaneType) {
		case AIRBUS:
			airplane = new Airbus();
			break;
		case BOEING:
			airplane = new Boeing();
			break;
		default:
			airplane = null;
		}
		return airplane;
	}

}
