package calc.abstractFactory;

public class CalcFactoryImpl extends CalcFactory{

    @Override
    public IMathAction operation(char operation) {
        if (operation == '+') {
            return new AdditionOperation();
        }
        if (operation == '-') {
            return new SubtractionOperation();
        }
        if (operation == '*' || operation == 'x') {
            return new MultiplyOperation();
        }
        if (operation == '/') {
            return new DivisionOperation();
        }
        return null;
    }
}
