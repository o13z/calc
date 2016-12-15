package calc.strategy;

/**
 * Created by User on 015 15.12.16.
 */
public class Context {
    private IStrategy strategy;

    public void setStrategy (IStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy (int a, int b) {
        return strategy.execute(a, b);
    }
}
