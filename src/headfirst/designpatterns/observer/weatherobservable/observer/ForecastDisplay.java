package headfirst.designpatterns.observer.weatherobservable.observer;

import headfirst.designpatterns.observer.weatherobservable.subject.WeatherData;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

  private final Observable observable;
  private float currentPressure = 0f;
  private float lastPressure = 0f;

  public ForecastDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);   // add yourself as observer.
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

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {   // check instance type before processing.
      WeatherData weatherData = (WeatherData) o;
      this.lastPressure = currentPressure;
      this.currentPressure = weatherData.getPressure();
      display();
    }
  }
}
