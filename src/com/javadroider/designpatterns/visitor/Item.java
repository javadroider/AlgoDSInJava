package com.javadroider.designpatterns.visitor;

public interface Item {

	public int accept(ItemVisitor visitor);
}
