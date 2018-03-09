package com.divine.builder;

// Custom builder NOT Thread safe
public class Person {
	private String name;
	private int age;
	
	private Person() {
	}
	
	public static Builder newBuilder() {
		return new Person().new Builder();
	}

	/**
	 * Advantage: comfortable for modifying
	 * Disadvantage: not thread safe
	 * */
	public class Builder {

		private Builder() {

		}

		public Builder name(String name) {
			Person.this.name = name;

			return this;
		}

		public Builder age(int age) {
			Person.this.age = age;

			return this;
		}

		public Person build() {

			return Person.this;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
