package com.divine.factory.method.innerclass;

// Not profit for huge system
public final class ShapeFactory {
	
	private ShapeFactory() {
	}
	
	public static Picture newSquare() {
		return new ShapeFactory().new Square();
	}
	
	public static Picture newTriangle() {
		return new ShapeFactory().new Triangle();
	}
	
	public static Picture newCircuit() {
		return new ShapeFactory().new Circuit();
	}
	
	
	public class Square implements Picture{

		@Override
		public void show() {
			System.out.println("Square ");
			
		}
		
	}
	
	public class Triangle implements Picture{

		@Override
		public void show() {
			System.out.println("Triangle");			
		}
	}
	
	public class Circuit implements Picture{

		@Override
		public void show() {
			System.out.println("Circuit");			
		}
	}

}
