package calc.abstractFactory1;

import calc.ICalculator;

public interface AbstractCalculatorFactory {
    ICalculator createSimpleCalc();
    ICalculator createSuperCalc();
}
