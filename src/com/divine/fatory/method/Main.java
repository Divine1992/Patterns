package com.divine.fatory.method;

import com.divine.fatory.method.classic.Animation;
import com.divine.fatory.method.classic.AnimationFactory;
import com.divine.fatory.method.classic.AnimationType;
import com.divine.fatory.method.innerclass.Picture;
import com.divine.fatory.method.innerclass.ShapeFactory;

public class Main {
	
	public static void main(String[] args) {
		// Example with inner classes
		Picture square = ShapeFactory.newSquare();
		square.show();
		
		Picture triangle = ShapeFactory.newTriangle();
		triangle.show();
		
		Picture circuit = ShapeFactory.newCircuit();
		circuit.show();
		
		//Classical example
		Animation movie = AnimationFactory.getInstance(AnimationType.MOVIE);
		movie.draw();
		Animation cartoon = AnimationFactory.getInstance(AnimationType.CARTOON);
		cartoon.draw();
	}
}
