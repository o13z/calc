package calc.template_method;

import calc.CalculatorImpl;
import calc.ICalculator;

public class PowerCalculator extends ACalculator {
    private ICalculator calc;
    private double rez;
    private int a, b;

    public PowerCalculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void initCalculator() {
        calc = new CalculatorImpl();
    }

    @Override
    void calculate() {
        rez = a;
        for(int i = 1; i <= b; i++) {
            rez = calc.mult(rez, i);
        }
    }

    @Override
    protected void printResult() {
        System.out.println("Raising " + a + " to power " + b + ". The result is: " + rez);
    }


}
