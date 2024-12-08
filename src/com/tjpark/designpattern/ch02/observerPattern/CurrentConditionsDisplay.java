package com.tjpark.designpattern.ch02.observerPattern;
	//observer, display 상속 받음 
public class CurrentConditionsDisplay implements ObserverInterface, DisplayElementInterface {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	//생성자 
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		//observer로 등록 
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}

