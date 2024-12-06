package com.tjpark.designpattern.ch01.strategyPattern;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.print("날개와 함께 날아요!!");
	}

}
