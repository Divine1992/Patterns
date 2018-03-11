package com.divine.singleton;

//Singleton class 

public final class Connection {
	private static volatile Connection connection;
	
	private Connection() {
	}
	
	public static Connection getInstance() {
		if(connection == null) {
			synchronized (Connection.class) {
				if(connection == null) {
					connection = new Connection();
				}
			}
		}
		return connection;
	}
}
