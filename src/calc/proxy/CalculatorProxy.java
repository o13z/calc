package calc.proxy;

public class CalculatorProxy implements ICalculator {
    private ICalculator calc;

    public CalculatorProxy(ICalculator calc) {
        this.calc = calc;
    }

    @Override
    public double add(double x, double y) {
        System.out.print(x + " + " + y + " = ");
        return calc.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        System.out.print(x + " - " + y + " = ");
        return calc.sub(x, y);
    }

    @Override
    public double mult(double x, double y) {
        System.out.print(x + " x " + y + " = ");
        return calc.mult(x, y);
    }

    @Override
    public double div(double x, double y) {
        System.out.print(x + " / " + y + " = ");
        return calc.div(x, y);
    }

}
