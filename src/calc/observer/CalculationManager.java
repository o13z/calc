package calc.observer;

import calc.proxy.CalculatorImpl;
import calc.proxy.CalculatorProxy;
import calc.proxy.ICalculator;

import java.util.ArrayList;
import java.util.List;

public class CalculationManager implements CalculationObservable {
	private List<EventHandler> observers;
	private ICalculator calc;

	public CalculationManager() {
		calc = new CalculatorProxy(new CalculatorImpl());
		observers = new ArrayList();
		loadListners();
	}
	private void loadListners(){
		addObserver(new SumObserver());
		addObserver(new SubtractionObserver());
		addObserver(new MultiplyObserver());
		addObserver(new DivideObserver());
	}

	@Override
	public void addObserver(EventHandler o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(EventHandler o) {
		observers.remove(o);
	}

	@Override
	public void notifyAllObservers(String operation) {
		for (EventHandler obs : observers) {
			obs.handleEvent(operation);
		}
	}

	public double callToAdd(double x, double y) {
		notifyAllObservers("sum");
		return calc.add(x, y);
	}

	public double callToSubtracion(double x, double y) {
		notifyAllObservers("sub");
		return calc.sub(x, y);
	}

	public double callToMultiply(double x, double y) {
		notifyAllObservers("mult");
		return calc.mult(x, y);
	}

	public double callToDivide(double x, double y) {
		notifyAllObservers("div");
		return calc.div(x, y);
	}
}
