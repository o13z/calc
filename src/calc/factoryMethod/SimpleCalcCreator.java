package calc.factoryMethod;

import calc.CalculatorImpl;
import calc.ICalculator;

public class SimpleCalcCreator extends ACalcCreator {
    @Override
    public ICalculator create() {
        return new CalculatorImpl();
    }
}
