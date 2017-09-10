package com.javadroider.designpatterns.creational.singleton;

public enum Singleton2 {

	INSTANCE;

	public void print() {
		System.out.println("I am here");
	}

	public static void main(String[] args) {
		Singleton2.INSTANCE.print();
	}
}
