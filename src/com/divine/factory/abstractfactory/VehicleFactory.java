package com.divine.factory.abstractfactory;

import com.divine.factory.abstractfactory.airplane.Airplane;
import com.divine.factory.abstractfactory.airplane.AirplaneType;
import com.divine.factory.abstractfactory.car.Car;
import com.divine.factory.abstractfactory.car.CarType;

public abstract class VehicleFactory {
	abstract Car getCar(CarType carType);
	abstract Airplane getPlane(AirplaneType airplaneType);
}
