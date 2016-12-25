import calc.command.CalculatorInvoker;
import calc.command.CalculatorReceiver;
import calc.command.ComputationCommand;
import calc.command.ICommand;
import org.junit.Test;

public class TestCommand {

    @Test
    public void testCommand() {
        CalculatorReceiver receiver = new CalculatorReceiver();

        ICommand addOperation = new ComputationCommand(receiver, '+');
        ICommand subtractOperation = new ComputationCommand(receiver, '-');
        ICommand multiplyOperation = new ComputationCommand(receiver, '*');
        ICommand divideOperation = new ComputationCommand(receiver, '/');

        CalculatorInvoker add = new CalculatorInvoker(addOperation);
        add.compute(2, 4);
        CalculatorInvoker sub = new CalculatorInvoker(subtractOperation);
        sub.compute(6, 4);
        CalculatorInvoker mult = new CalculatorInvoker(multiplyOperation);
        mult.compute(2, 4);
        CalculatorInvoker div = new CalculatorInvoker(divideOperation);
        div.compute(9, 4);
    }

    @Test
    public void testNonExistedCommand() {
        CalculatorReceiver receiver = new CalculatorReceiver();
        ICommand erundaOperation = new ComputationCommand(receiver, '$');
        CalculatorInvoker unknown = new CalculatorInvoker(erundaOperation);
        unknown.compute(3, 5);
    }
}
