package com.divine.fatory.abstractfactory;

import com.divine.fatory.abstractfactory.airplane.Airplane;
import com.divine.fatory.abstractfactory.airplane.AirplaneType;
import com.divine.fatory.abstractfactory.car.Car;
import com.divine.fatory.abstractfactory.car.CarType;

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
