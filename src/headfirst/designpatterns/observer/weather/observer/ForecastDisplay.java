package headfirst.designpatterns.observer.weather.observer;

import headfirst.designpatterns.observer.weather.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

  private float currentPressure = 0f;
  private float lastPressure = 0f;
  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);   // register yourself as observer.
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    lastPressure = currentPressure;
    currentPressure = temp;
    display();
  }

  @Override
  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the day.");
    } else if (currentPressure == lastPressure) {
      System.out.println("Almost the same weather.");
    } else {
      System.out.println("Watch out for cooler, rainy weather.");
    }
  }
}
