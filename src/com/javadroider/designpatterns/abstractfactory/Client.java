package com.javadroider.designpatterns.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		
		AbstractShapeFactory.getShapeFactory(1).getShape(1).draw();
		AbstractShapeFactory.getShapeFactory(2).getShape(3).draw();
	}
}
