package calc.composer;

import calc.ICalculator;

public interface IComponent {
    void addSimpleCalc(ICalculator c);
    void addEngeneerCalc(ICalculator c);
    ICalculator getSimple();
    ICalculator getIng();
}
