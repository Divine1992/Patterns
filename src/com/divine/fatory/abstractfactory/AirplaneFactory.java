package com.divine.fatory.abstractfactory;

import com.divine.fatory.abstractfactory.airplane.Airbus;
import com.divine.fatory.abstractfactory.airplane.Airplane;
import com.divine.fatory.abstractfactory.airplane.AirplaneType;
import com.divine.fatory.abstractfactory.airplane.Boeing;
import com.divine.fatory.abstractfactory.car.Car;
import com.divine.fatory.abstractfactory.car.CarType;

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
