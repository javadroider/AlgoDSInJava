package com.javadroider.designpatterns.visitor;

public class Pen implements Item {

	private int price;

	public Pen(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int accept(ItemVisitor visitor) {
		return visitor.visit(this);
	}

}
