package calc.proxy;

public class Calculator implements CalculatorInterface {

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
