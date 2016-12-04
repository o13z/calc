package calc;

public class CalculatorImpl implements ICalculator {

    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }

    @Override
    public double mult(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        return x/y;
    }
}
