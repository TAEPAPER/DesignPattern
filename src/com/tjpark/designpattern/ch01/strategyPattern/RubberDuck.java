package com.tjpark.designpattern.ch01.strategyPattern;

public class RubberDuck extends Duck {
	
	RubberDuck(){
		flyBehavior = new FlyNo();
		quackBehavior  = new QuackWithLoud();
	}

	@Override
	public void display() {
		System.out.print("저는 러버덕이에요!!");
	}
	
	
	
}
