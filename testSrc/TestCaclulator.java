import calc.CalculatorImpl;
import calc.ICalculator;
import calc.observer.MathOperationsTypeCounterCounter;
import calc.proxy.CalculatorProxy;
import org.junit.Test;

public class TestCaclulator {
    @Test
    public void testSimpleCalculations() {
        ICalculator realCalc = new CalculatorImpl();
        ICalculator calc = new CalculatorProxy(realCalc);
        System.out.println(calc.add(3, 4)); //addition
        System.out.println(calc.sub(3, 4)); //subtraction
        System.out.println(calc.mult(3, 4)); //multiplication
        System.out.println(calc.div(3, 4)); //division
        System.out.println("----------------------------------------------");
        System.out.println("The total number of mathematical operations is " + MathOperationsTypeCounterCounter.getNumberOfOperations());
    }

}
