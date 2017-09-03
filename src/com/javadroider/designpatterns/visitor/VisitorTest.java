package com.javadroider.designpatterns.visitor;

public class VisitorTest {
	public static void main(String[] args) {
		ItemVisitor visitor = new ItemVisitor();
		Item[] items = new Item[] { new Book(100, "Some book"), new Pen(10) };

		for (Item item : items) {
			System.out.println(item.accept(visitor));
		}

	}

}
