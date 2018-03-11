package com.divine.prototype;

public class Apartament implements Copyable<Apartament> {
	private int area;
	private String address;

	public Apartament(int area, String address) {
		this.area = area;
		this.address = address;
	}

	@Override
	public Apartament copy() {
		return this;
	}

	public int getArea() {
		return area;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Apartament [area=" + area + ", address=" + address + "]";
	}

}
