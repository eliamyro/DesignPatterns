package observer_pattern.observers;

import observer_pattern.interfaces.DisplayElement;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

/**
 * Created by eliamyro on 29/6/17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " C degrees and " + humidity + "% humidity.");
    }
}
