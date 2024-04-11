package app.service;

import app.model.Observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(int temperature, String color, int weight) {
        System.out.println("Color: " + color + ", Weight: " + weight + "g" + ", Temperature: " + temperature);
    }
}




