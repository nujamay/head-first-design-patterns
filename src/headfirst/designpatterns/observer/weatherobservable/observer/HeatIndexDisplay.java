package headfirst.designpatterns.observer.weatherobservable.observer;

import headfirst.designpatterns.observer.weatherobservable.subject.WeatherData;
import java.util.Observable;
import java.util.Observer;

/**
 * Heat Index display class.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

  private final Observable observable;
  private float heatIndex;

  public HeatIndexDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);   // add yourself as observer.
  }

  @Override
  public void display() {
    System.out.println("Heat Index: " + heatIndex);
  }

  private float computeHeatIndex(float t, float rh) {
    return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
        (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
        (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
        (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
        (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
        (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
        0.000000000843296 * (t * t * rh * rh * rh)) -
        (0.0000000000481975 * (t * t * t * rh * rh * rh)));
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {   // check instance type before processing.
      WeatherData weatherData = (WeatherData) o;
      heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
      display();
    }
  }
}
