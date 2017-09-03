package com.javadroider.designpatterns.visitor;

public class Book implements Item {

	private int price;

	public Book(int price, String name) {
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
