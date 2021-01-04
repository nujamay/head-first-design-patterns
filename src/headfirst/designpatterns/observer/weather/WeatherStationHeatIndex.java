package headfirst.designpatterns.observer.weather;

import headfirst.designpatterns.observer.weather.observer.CurrentConditionDisplay;
import headfirst.designpatterns.observer.weather.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weather.observer.HeatIndexDisplay;
import headfirst.designpatterns.observer.weather.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weather.subject.WeatherData;

/**
 * Weather Station Class (Client Code).
 */
public class WeatherStationHeatIndex {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    /*
     * Create 3 types of display element.
     * Pass the WeatherData object as Subject and register each element as Observer.
     */
    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    HeatIndexDisplay healtIndexDisplay = new HeatIndexDisplay(weatherData);

    /*
     * Set each value.
     * The WeatherData object send a notification to update display elements.
     * Actually, the notification means that Subject calls update method in observers.
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
