package com.divine.prototype;

public class Main {
	
	public static void main(String[] args) {
		// Using interface
		Apartament ap1 = new Apartament(35, "NY Aw5");
		Apartament ap2 = ap1.copy(); 
		System.out.println("ap1 "+ap1);
		System.out.println("ap2 "+ap2);
		
		// Using factory
		Apartament ap3 = CloneFactory.copy(ap1);
		System.out.println("ap3 "+ap3);
		
	}
}
