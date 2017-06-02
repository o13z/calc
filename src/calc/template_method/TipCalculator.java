package calc.template_method;

import calc.CalculatorImpl;
import calc.ICalculator;

public class TipCalculator extends ACalculator{
    private ICalculator calc;
    private int a;
    private double rez;

    public TipCalculator (int total) {
        this.a = total;
    }

    @Override
    protected void initCalculator() {
        calc = new CalculatorImpl();
    }

    @Override
    protected void calculate() {
        rez = (a > 100) ? a/20 : a/10;
    }

    @Override
    protected void printResult() {
        System.out.println("For the Total of "+ a + "$ it's recommended to leave a tip ~ " + rez + "$");
    }
}
