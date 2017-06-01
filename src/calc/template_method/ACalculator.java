package calc.template_method;

public abstract class ACalculator {

    abstract void initCalculator();
    abstract void calculate();
    protected abstract void printResult();

    public final void goCalc() {
        initCalculator();
        calculate();
        printResult();
    }
}
