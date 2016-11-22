package calc.proxy;

import org.junit.Test;

public class TestCaclProxy {
    @Test
    public void testCalculations() {
        ICalculator realCalc = new CalculatorImpl();
        ICalculator calc = new CalculatorProxy(realCalc);
        System.out.println(calc.add(3, 4));
        System.out.println(calc.sub(3, 4));
        System.out.println(calc.mult(3, 4));
        System.out.println(calc.div(3, 4));

    }

}
