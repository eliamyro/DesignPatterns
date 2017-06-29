package observer_pattern;

import observer_pattern.observers.CurrentConditionsDisplay;
import observer_pattern.observers.ForecastDisplay;
import observer_pattern.subject.WeatherData;

/**
 * Created by eliamyro on 29/6/17.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurementes(25.5f, 80, 2.5f);
        weatherData.setMeasurementes(18, 55, 1.3f);
    }
}
