package calc.proxy;

import calc.observer.MathOperationsCounter;
import org.junit.Test;

public class TestCaclProxy {
    @Test
    public void testCalculations() {
        ICalculator realCalc = new CalculatorImpl();
        ICalculator calc = new CalculatorProxy(realCalc);
        System.out.println(calc.add(3, 4)); //addition
        System.out.println(calc.sub(3, 4)); //subtraction
        System.out.println(calc.mult(3, 4)); //multiplication
        System.out.println(calc.div(3, 4)); //division

        System.out.println("----------------------------------------------");
        System.out.println("The total number of mathematical operations is " + MathOperationsCounter.getNumberOfOperations());
    }

}
