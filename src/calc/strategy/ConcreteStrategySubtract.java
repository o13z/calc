package calc.strategy;

public class ConcreteStrategySubtract implements IStrategy {
    @Override
    public int execute(int a, int b) {
        System.out.print("A new subtract operation: "+a+"-"+b+"=");
        return a-b;
    }
}
