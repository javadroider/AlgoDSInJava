/**
 * 
 */
package com.javadroider.designpatterns.creational.singleton;

/**
 *
 */
public class Singleton1 {

	private static Singleton1 INSTANCE = null;

	private Singleton1() {

		if (INSTANCE != null) {
			throw new RuntimeException("Use getInstance method");
		}
	}

	public static Singleton1 getInstance() {
		if (INSTANCE == null) {

			synchronized (Singleton1.class) {

				if (INSTANCE == null) {
					INSTANCE = new Singleton1();
				}
			}
		}
		return INSTANCE;
	}

	protected Singleton1 readResolve() {
		return getInstance();
	}
}
