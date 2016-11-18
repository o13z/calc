package calc.observer;

public interface CalculationObservable {
	void addObserver(EventHandler o);
	void removeObserver(EventHandler o);
	void notifyAllObservers(String s);
}
