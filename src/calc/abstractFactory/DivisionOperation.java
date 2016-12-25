package calc.abstractFactory;

public class DivisionOperation implements IMathAction {

    @Override
    public double doAction(int x, int y) {
        System.out.print(x + " / " + y + " = ");
        return x/y;
    }
}
