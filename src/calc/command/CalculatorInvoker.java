package calc.command;

/**
 * The Invoker class
 */
public class CalculatorInvoker {
    private ICommand command;

    public CalculatorInvoker(ICommand c) {
        this.command = c;
    }

    public void compute(int x, int y) {
       command.execute(x, y);
    }
}
