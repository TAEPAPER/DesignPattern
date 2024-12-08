package com.tjpark.designpattern.ch02.observerPattern;

public interface SubjectInterface {
	//subject : observer  = 신문사 : 구독자 
	
	//observer 등록
	public void registerObserver(ObserverInterface o);
	//observer 삭제 
	public void removeObserver(ObserverInterface o);
	//observer들에게 알림  
	public void notifyObservers();
}

