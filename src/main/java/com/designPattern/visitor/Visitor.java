package com.designPattern.visitor;

/*
 * 访问者
 */
public interface Visitor {
	public void visit(Park park);
	public void visit(ParkA parkA);
	public void visit(ParkB parkB);
}
