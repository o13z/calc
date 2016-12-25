package calc.abstractFactory;

public abstract class CalcFactory {
    public abstract AdditionOperation createAdd();
    public abstract SubtractionOperation createSub();
    public abstract MultiplyOperation createMult();
    public abstract DivisionOperation createDiv();

}
