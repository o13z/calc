package calc.abstractFactory;

public class MultiplyOperation implements IMathAction {

    @Override
    public double doAction(int x, int y) {
        System.out.print(x + " x " + y + " = ");
        return x*y;
    }
}
