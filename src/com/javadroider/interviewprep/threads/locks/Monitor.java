package com.javadroider.interviewprep.threads.locks;

public class Monitor {

	private boolean notified = false;

	public synchronized void doWait(){
		while(!notified){
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
	}

	public synchronized void doNotify(){
		notified = true;
		notify();
	}
}
