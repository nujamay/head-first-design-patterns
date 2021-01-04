package headfirst.designpatterns.observer.weather.observer;

import headfirst.designpatterns.observer.weather.subject.WeatherData;

/**
 * Current condition display class.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

  private float temperature = 0f;
  private float humidity = 0f;
  private WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);   // register yourself as observer.
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out
        .println("Current: Temperature " + temperature + " degrees, Humidity " + humidity + " %");
  }
}
