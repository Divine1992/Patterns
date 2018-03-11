package com.divine.fatory.abstractfactory;

import com.divine.fatory.abstractfactory.airplane.Airplane;
import com.divine.fatory.abstractfactory.airplane.AirplaneType;
import com.divine.fatory.abstractfactory.car.Car;
import com.divine.fatory.abstractfactory.car.CarType;
import com.divine.fatory.abstractfactory.car.Mercedes;
import com.divine.fatory.abstractfactory.car.Volvo;

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
