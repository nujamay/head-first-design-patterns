package headfirst.designpatterns.observer.weatherobservable.subject;

import java.util.Observable;

/**
 * WeatherData class.
 */
public class WeatherData extends Observable {

  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
  }

  /**
   * Change status and call {@link Observable#notifyObservers()}.
   */
  public void measurementsChange() {
    setChanged();
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

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
