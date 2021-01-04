package headfirst.designpatterns.observer.weatherobservable.observer;

import headfirst.designpatterns.observer.weatherobservable.subject.WeatherData;
import java.util.Observable;
import java.util.Observer;

/**
 * Statistics display class.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

  private final Observable observable;
  private float tempSum = 0f;
  private float maxTemp = 0f;
  private float minTemp = 0f;
  private int numOfReading = 0;

  public StatisticsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);   // add yourself as observer.
  }

  @Override
  public void display() {
    System.out.println(
        "Temperature: Avg / Max / Min = " + (tempSum / numOfReading) + " / " + maxTemp + " / "
            + minTemp);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {    // check instance type before processing.
      WeatherData weatherData = (WeatherData) o;
      float temp = weatherData.getTemperature();
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
  }
}
