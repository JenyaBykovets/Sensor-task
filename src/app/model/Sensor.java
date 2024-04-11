package app.model;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;
    private String color;
    private int weight;


    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (temperature <= 0) {
            color = "White";
            weight = 1;
        } else {
            color = "Black";
            weight = 2 * temperature;
        }
        notifyObservers();
    }


    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, color, weight);
        }
    }
}


