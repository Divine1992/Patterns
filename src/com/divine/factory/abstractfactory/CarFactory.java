package com.divine.factory.abstractfactory;

import com.divine.factory.abstractfactory.airplane.Airplane;
import com.divine.factory.abstractfactory.airplane.AirplaneType;
import com.divine.factory.abstractfactory.car.Car;
import com.divine.factory.abstractfactory.car.CarType;
import com.divine.factory.abstractfactory.car.Mercedes;
import com.divine.factory.abstractfactory.car.Volvo;

public class CarFactory extends VehicleFactory {

	@Override
	Car getCar(CarType carType) {
		Car car;
		switch (carType) {
		case MERCEDES:
			car = new Mercedes();
			break;
		case VOLVO:
			car = new Volvo();
			break;
		default:
			car = null;
		}
		return car;
	}

	@Override
	Airplane getPlane(AirplaneType airplaneType) {
		return null;
	}

}
