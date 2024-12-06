package com.tjpark.designpattern.ch01.strategyPattern;

public class QuackNo implements QuackBehavior {

	@Override
	public void quack() {
		System.out.print("쾍쾍하지 않아요!!!");
	}

}
