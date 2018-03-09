package com.divine.builder;

// Traditional builder
public class Bank {
	private final String name;
	private final String username;
	private final Account account;

	private Bank(String name, String username, Account account) {
		this.name = name;
		this.username = username;
		this.account = account;
	}
	
	/**
	 * Advantage: thread safe
	 * Disadvantage: not comfortable for modifying(duplicate fields)  
	 * */
	public static class Builder{
		private String name;
		private String username;
		private Account account;
		
		public Builder name(String name) {
			this.name = name;
			
			return this;
		}
		
		public Builder username(String username) {
			this.username = username;
			
			return this;
		}
		
		public Builder account(Account account) {
			this.account =account;
			
			return this;
		}
		
		public Bank build() {
			return new Bank(this.name, this.username, this.account);
		}
		
		
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public Account getAccount() {
		return account;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", username=" + username + ", account=" + account + "]";
	}

}
