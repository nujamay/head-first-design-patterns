package headfirst.designpatterns.observer.subject;

import headfirst.designpatterns.observer.observer.Observer;

/**
 * Subject interface.
 */
public interface Subject {

  /**
   * Register an observer.
   *
   * @param o {@link Observer}
   */
  public void registerObserver(Observer o);

  /**
   * Remove an observer.
   *
   * @param o {@link Observer}
   */
  public void removeObserver(Observer o);

  /**
   * Notify something to observers.
   */
  public void notifyObservers();
}
