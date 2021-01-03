package headfirst.designpatterns.observer.observer;

/**
 * Observer interface.
 */
public interface Observer {

  /**
   * Update an observer with measured values.
   *
   * @param temp temperature
   * @param humidity humidity
   * @param pressure pressure
   */
  public void update(float temp, float humidity, float pressure);
}
