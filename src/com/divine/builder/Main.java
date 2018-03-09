package com.divine.builder;

public class Main {

	public static void main(String... args) {

		// Custom builder
		Person person = Person.newBuilder().name("John").age(10).build();

		System.out.println(person);

		// Traditional builders
		Account account = new Account.Builder().id(1).value(100).build();

		System.out.println(account);

		Bank bank = new Bank.Builder().name("bank of America").username("Lampard")
				.account(new Account.Builder().id(2).value(250).build()).build();

		System.out.println(bank);

	}
}
