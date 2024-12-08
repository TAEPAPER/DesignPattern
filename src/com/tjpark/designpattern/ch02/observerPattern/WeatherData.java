package com.tjpark.designpattern.ch02.observerPattern;

import java.util.*;

//subjectInterface 구현체 
public class WeatherData implements SubjectInterface {
	private List<ObserverInterface> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() { //생성자 
		observers = new ArrayList<ObserverInterface>();
	}
	
	public void registerObserver(ObserverInterface o) {
		observers.add(o);
	}
	
	public void removeObserver(ObserverInterface o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (ObserverInterface observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
