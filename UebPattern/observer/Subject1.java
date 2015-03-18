package UebPattern.observer;

public interface Subject1 {
    public void registerObserver(Observer1 o);

    public void removeObserver(Observer1 o);

    public void notifyAllObservers();
}
