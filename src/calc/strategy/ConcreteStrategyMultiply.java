package calc.strategy;

public class ConcreteStrategyMultiply implements IStrategy {
    @Override
    public int execute(int a, int b) {
        System.out.print("A new multiply operation: "+a+"*"+b+"=");
        return a*b;
    }
}
