package calc.proxy;

/**
 * Created by User on 017 17.11.16.
 */
public class CalculatorProxy implements CalculatorInterface {
    private Calculator calc;

    public CalculatorProxy() {
        calc = new Calculator();
    }

    @Override
    public double add(double x, double y) {
        return calc.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        return calc.sub(x, y);
    }

    @Override
    public double mult(double x, double y) {
        return calc.mult(x, y);
    }

    @Override
    public double div(double x, double y) {
        return calc.div(x, y);
    }
}
