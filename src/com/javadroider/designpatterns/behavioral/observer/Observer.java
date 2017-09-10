package com.javadroider.designpatterns.behavioral.observer;

import java.util.Map;

public interface Observer {

	public void stateChange(Map<String, String> data);
}
