package calc.abstractFactory1;


import calc.CalculatorImpl;
import calc.ICalculator;
import calc.decorator.CalcWithPoweringAndExtraction;

public class CalcFactory implements AbstractCalculatorFactory{

    @Override
    public ICalculator createSimpleCalc() {
        return new CalculatorImpl();
    }

    @Override
    public ICalculator createSuperCalc() {
        return new CalcWithPoweringAndExtraction(new CalculatorImpl());
    }
}
