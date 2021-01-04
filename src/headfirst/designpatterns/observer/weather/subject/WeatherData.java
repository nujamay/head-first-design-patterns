package headfirst.designpatterns.observer.weather.subject;

import headfirst.designpatterns.observer.weather.observer.Observer;
import headfirst.designpatterns.observer.weather.subject.Subject;
import java.util.ArrayList;

/**
 * WeatherData class.
 */
public class WeatherData implements Subject {

  private ArrayList observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
    System.out.println("Add an observer. (Observer index: " + observers.size() + ")");
  }

  @Override
  public void removeObserver(Observer o) {
    boolean isRemoved = observers.remove(o);
    if (isRemoved) {
      System.out.println("Succeed to remove an observer.");
    } else {
      System.out.println("Failed to remove an observer. It might not be registered.");
    }
  }

  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer) observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

  /**
   * Call {@link this#notifyObservers()} when you get any update from the Weather Station.
   */
  public void measurementsChange() {
    notifyObservers();
  }

  /**
   * Set each measured values and call {@link this#measurementsChange()}.
   *
   * @param temperature temperature
   * @param humidity humidity
   * @param pressure pressure
   */
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChange();
  }
}
