package calc.proxy;

/**
 * Created by User on 017 17.11.16.
 */
public class CalculatorProxy implements CalculatorInterface {
    private Calculator calc;

    @Override
    public double add(double x, double y) {
        if (calc == null) {calc = new Calculator();}
        return calc.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        if (calc == null) {calc = new Calculator();}
        return calc.sub(x, y);
    }

    @Override
    public double mult(double x, double y) {
        if (calc == null) {calc = new Calculator();}
        return calc.mult(x, y);
    }

    @Override
    public double div(double x, double y) {
        if (calc == null) {calc = new Calculator();}
        return calc.div(x, y);
    }
}
