package headfirst.designpatterns.observer.observer;

import headfirst.designpatterns.observer.subject.WeatherData;

/**
 * Statistics display class.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

  private float tempSum = 0f;
  private float maxTemp = 0f;
  private float minTemp = 0f;
  private int numOfReading = 0;
  private WeatherData weatherData;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);   // register yourself as observer.
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    tempSum = tempSum + temp;
    numOfReading++;

    if (temp > maxTemp) {
      maxTemp = temp;
    }

    if (temp < minTemp) {
      minTemp = temp;
    }

    display();
  }

  @Override
  public void display() {
    System.out.println(
        "Temperature: Avg / Max / Min = " + (tempSum / numOfReading) + " / " + maxTemp + " / "
            + minTemp);
  }
}
