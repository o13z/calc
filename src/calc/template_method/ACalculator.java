package calc.template_method;

public abstract class ACalculator {

    protected abstract void initCalculator();
    protected abstract void calculate();
    protected abstract void printResult();

    public final void goCalc() {
        initCalculator();
        calculate();
        printResult();
    }
}
