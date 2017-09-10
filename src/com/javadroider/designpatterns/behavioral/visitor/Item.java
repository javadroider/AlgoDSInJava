package com.javadroider.designpatterns.behavioral.visitor;

public interface Item {

	public int accept(ItemVisitor visitor);
}
