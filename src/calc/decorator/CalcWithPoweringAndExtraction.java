package calc.decorator;

import calc.ICalculator;

public class CalcWithPoweringAndExtraction extends CalcDecorator{

    public CalcWithPoweringAndExtraction(ICalculator calculator) {
        super(calculator);
    }

    @Override
    public double add(double x, double y) {
        System.out.print(x + " + " + y + " = ");
        return super.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        System.out.print(x + " - " + y + " = ");
        return super.sub(x, y);
    }

    @Override
    public double mult(double x, double y) {
        System.out.print(x + " x " + y + " = ");
        return super.mult(x, y);
    }

    @Override
    public double div(double x, double y) {
        System.out.print(x + " / " + y + " = ");
        return super.div(x, y);
    }

    @Override
    public double inPower(double x, int n) {
        System.out.print("Raising " + x + " in the " + n + " power. That is how we do it: ");
        return super.inPower(x, n);
    }

    @Override
    public double extraction(double x) {
        if (Math.sqrt(x)  % 1 != 0) {
            System.out.print("The square-root from number " + (int)x + " is ugly: ");
        } else {
            System.out.print("Square-root generation from number: " + (int)x + ". The result is: ");
        }
        return super.extraction(x);
    }
}
