package calc.abstractFactory1;

import calc.ICalculator;

public class CalcCreator {
    private ICalculator simpleCalc;
    private ICalculator superCalc;

    public CalcCreator(AbstractCalculatorFactory f) {
        simpleCalc = f.createSimpleCalc();
        superCalc = f.createSuperCalc();
    }

    public ICalculator getSimpleCalc() {
        return simpleCalc;
    }

    public ICalculator getSuperCalc() {
        return superCalc;
    }
}
