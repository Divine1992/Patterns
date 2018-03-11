package com.divine.fatory.method.classic;

public class AnimationFactory {
	
	public static Animation getInstance(AnimationType type) {
		Animation animation;
		switch(type){
			case MOVIE:
				animation = new Movie();
				break;
			case CARTOON:
				animation = new Cartoon();
				break;
			default:
				animation = null;
		}
		return animation;
	}

}
