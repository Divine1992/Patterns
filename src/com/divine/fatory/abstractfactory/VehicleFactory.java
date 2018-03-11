package com.divine.fatory.abstractfactory;

import com.divine.fatory.abstractfactory.airplane.Airplane;
import com.divine.fatory.abstractfactory.airplane.AirplaneType;
import com.divine.fatory.abstractfactory.car.Car;
import com.divine.fatory.abstractfactory.car.CarType;

public abstract class VehicleFactory {
	abstract Car getCar(CarType carType);
	abstract Airplane getPlane(AirplaneType airplaneType);
}
