package calc.abstractFactory;

public class SubtractionOperation implements IMathAction {

    @Override
    public double doAction(int x, int y) {
        System.out.print(x + " - " + y + " = ");
        return x-y;
    }
}
