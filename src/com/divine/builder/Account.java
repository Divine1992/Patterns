package com.divine.builder;

//Traditional builder
public class Account {
	private final int id;
	private final int value;
	
	private Account(int id, int value) {
		this.id = id;
		this.value = value;
	}
	
	/**
	 * Advantage: thread safe
	 * Disadvantage: not comfortable for modifying(duplicate fields)  
	 * */
	public static class Builder{
		private int id;
		private int value;
		
		public Builder id(int id) {
			this.id = id;
			
			return this;
		}
		
		public Builder value(int value) {
			this.value = value;
			
			return this;
		}
		
		public Account build() {
			return new Account(id, value);
		}
	}

	public int getId() {
		return id;
	}

	public int getAmount() {
		return value;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", amount=" + value + "]";
	}
	
}
