package app.service;

import app.model.Sensor;

public class ObserverPattern {
    public void runObserverPattern() {
        Sensor sensor = new Sensor();
        ConcreteObserver observer = new ConcreteObserver();

        sensor.addObserver(observer);

        sensor.setTemperature(-1);
        sensor.setTemperature(4);
    }
}


