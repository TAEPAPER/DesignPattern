package com.tjpark.designpattern.ch01.strategyPattern;

public class QuackWithLoud implements QuackBehavior {

	@Override
	public void quack() {
		System.out.print("쾍쾍 크게 쾍쾍!!!");
	}

}
