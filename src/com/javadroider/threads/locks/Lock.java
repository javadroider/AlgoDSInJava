package com.javadroider.threads.locks;

/**
 * Lock interface to extend different implementations
 * 
 */
public interface Lock {
	void lock();
	void unlock();
}
