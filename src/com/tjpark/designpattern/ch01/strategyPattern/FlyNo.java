package com.tjpark.designpattern.ch01.strategyPattern;

public class FlyNo implements FlyBehavior {

	@Override
	public void fly() {
		System.out.print("날지 않아요!!!");

	}

}
