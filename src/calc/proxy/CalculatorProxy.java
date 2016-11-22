package calc.proxy;

import calc.observer.CalculationObservable;
import calc.observer.EventHandler;
import calc.observer.MathOperationObserver;
import calc.observer.MathOperationsCounter;

import java.util.ArrayList;
import java.util.List;

public class CalculatorProxy implements ICalculator, CalculationObservable {
    private ICalculator calc;
    private MathOperationObserver mathObs;
    private List<EventHandler> observers;

    public CalculatorProxy(ICalculator calc) {
        this.calc = calc;
        mathObs = new MathOperationObserver();
        observers = new ArrayList();
        loadListners();
    }

    private void loadListners(){
        addObserver(new MathOperationObserver());
        addObserver(new MathOperationsCounter());
    }

    @Override
    public double add(double x, double y) {
        notifyAllObservers("add");
        System.out.print(x + " + " + y + " = ");
        return calc.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        notifyAllObservers("sub");
        System.out.print(x + " - " + y + " = ");
        return calc.sub(x, y);
    }

    @Override
    public double mult(double x, double y) {
        notifyAllObservers("mult");
        System.out.print(x + " x " + y + " = ");
        return calc.mult(x, y);
    }

    @Override
    public double div(double x, double y) {
        notifyAllObservers("div");
        System.out.print(x + " / " + y + " = ");
        return calc.div(x, y);
    }

    @Override
    public void addObserver(EventHandler o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(EventHandler o) {

    }

    @Override
    public void notifyAllObservers(String operation) {
        for (EventHandler obs : observers) {
            obs.handleEvent(operation);
        }
    }
}
