package headfirst.designpatterns.observer.weatherobservable;

import headfirst.designpatterns.observer.weatherobservable.observer.CurrentConditionDisplay;
import headfirst.designpatterns.observer.weatherobservable.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weatherobservable.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weatherobservable.subject.WeatherData;

/**
 * Weather Station Class (Client Code).
 */
public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    /*
     * Create 3 types of display element.
     * Pass the WeatherData object as Subject and add each element as Observer.
     * NOTE: The order of notification is NOT guaranteed because this code uses `java.util.Observable`. It's specification.
     */
    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    /*
     * Set each value.
     * The WeatherData object send a notification to update display elements.
     */
    separator();
    weatherData.setMeasurements(27, 65, 30.4f);
    separator();
    weatherData.setMeasurements(27, 70, 29.2f);
    separator();
    weatherData.setMeasurements(26, 90, 29.2f);
  }

  private static void separator() {
    System.out.println("----------------------");
  }

}
