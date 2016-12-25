package calc.abstractFactory;

public class CalcFactoryImpl {
    public AdditionOperation createAdd() {
        return new AdditionOperation();
    }

    public SubtractionOperation createSub() {
        return new SubtractionOperation();
    }

    public MultiplyOperation createMult() {
        return new MultiplyOperation();
    }

    public DivisionOperation createDiv() {
        return new DivisionOperation();
    }
}
