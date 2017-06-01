package calc.factoryMethod;

import calc.CalculatorImpl;
import calc.ICalculator;
import calc.decorator.CalcWithPoweringAndExtraction;

public class SuperCalcCreator extends ACalcCreator {

    @Override
    public ICalculator create() {
        return new CalcWithPoweringAndExtraction(new CalculatorImpl());
    }
}
