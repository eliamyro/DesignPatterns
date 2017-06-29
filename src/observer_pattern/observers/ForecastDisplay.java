package observer_pattern.observers;

import observer_pattern.subject.WeatherData;
import observer_pattern.interfaces.DisplayElement;
import observer_pattern.interfaces.Observer;

/**
 * Created by eliamyro on 29/6/17.
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float temp;
    private float pressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        if (temp > 20) {
            System.out.println("Forecast: The weather will be good. No rain at all. Temperature " + temp + "C degrees and"
                    + pressure + " pressure.");
        } else {
            System.out.println("Forecast: The weather will be bad. It will rain. Temperature " + temp
                    + "C degrees and" + pressure + " pressure.");
        }
    }
}
