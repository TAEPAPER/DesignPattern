package com.tjpark.designpattern.ch01.strategyPattern;

public class MainExcutor {

	public static void main(String[] args) {
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		rubberDuck.setFlyBehavior(new FlyWithWings());
		
		rubberDuck.performFly();
		
	}

}
