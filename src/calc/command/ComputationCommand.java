package calc.command;

/**
 * Concrete command
 */
public class ComputationCommand implements ICommand {
    private CalculatorReceiver calculator;
    private char operation;

    public ComputationCommand(CalculatorReceiver calculator, char operation) {
        this.calculator = calculator;
        this.operation = operation;
    }

    @Override
    public void execute(int x, int y) {
        calculator.doAction(operation, x, y);
    }
}
