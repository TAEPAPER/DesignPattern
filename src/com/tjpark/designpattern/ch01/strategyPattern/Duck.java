package com.tjpark.designpattern.ch01.strategyPattern;

public abstract class Duck {
	
	 FlyBehavior flyBehavior;
	 QuackBehavior quackBehavior;
	
	public Duck(){}
	
	
	public  void swim() {
		System.out.print("모든 오리는 물에 뜹니다!!!");
	};
	
	public abstract void display();
	
	
	public void performFly() {
		flyBehavior.fly();
	}	
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
