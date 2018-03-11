package com.divine.factory.abstractfactory;

import com.divine.factory.abstractfactory.airplane.Airplane;
import com.divine.factory.abstractfactory.airplane.AirplaneType;
import com.divine.factory.abstractfactory.car.Car;
import com.divine.factory.abstractfactory.car.CarType;

public class Main {
	
	public static void main(String[] args) {
		VehicleFactory carFactory = FactoryProducer.getFactory(VehicleType.CAR);
		Car mercedes = carFactory.getCar(CarType.MERCEDES);
		mercedes.move();
		
		VehicleFactory airplaneFactory = FactoryProducer.getFactory(VehicleType.AIRPLANE);
		Airplane boeing = airplaneFactory.getPlane(AirplaneType.BOEING);
		boeing.getUp();
	}
}
