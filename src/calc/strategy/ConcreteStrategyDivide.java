package calc.strategy;

public class ConcreteStrategyDivide implements IStrategy{
    @Override
    public int execute(int a, int b) {
        System.out.print("A new add operation: "+a+"/"+b+"=");
        return a/b;
    }
}
