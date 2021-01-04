package headfirst.designpatterns.observer.weatherobservable.observer;

import headfirst.designpatterns.observer.weatherobservable.subject.WeatherData;
import java.util.Observable;
import java.util.Observer;

/**
 * Current condition display class.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

  private final Observable observable;
  private float temperature = 0f;
  private float humidity = 0f;

  public CurrentConditionDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);   // add yourself as observer.
  }

  @Override
  public void display() {
    System.out
        .println("Current: Temperature " + temperature + " degrees, Humidity " + humidity + " %");
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {   // check instance type before processing.
      WeatherData weatherData = (WeatherData) o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }
}
