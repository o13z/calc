package calc.decorator;

import calc.ICalculator;
import calc.observer.MathOperationsTypeCounterCounter;

public class CalcWithPoweringAndExtraction extends CalcDecorator{

    MathOperationsTypeCounterCounter counter;


    public CalcWithPoweringAndExtraction(ICalculator calculator) {
        super(calculator);
        counter = new MathOperationsTypeCounterCounter();
    }

    @Override
    public double inPower(double x, int n) {
        counter.handleEvent("pow");
        System.out.print("Raising " + x + " in the " + n + " power. The result is: ");
        return super.inPower(x, n);
    }

    @Override
    public double extraction(double x) {
        counter.handleEvent("ext");
        if (Math.sqrt(x)  % 1 != 0) {
            System.out.print("The square-root from number " + (int)x + " is ugly: ");
        } else {
            System.out.print("Square-root generation from number: " + (int)x + ". The result is: ");
        }
        return super.extraction(x);
    }
}
