package calc.proxy;

import org.junit.Test;

/**
 * Created by User on 017 17.11.16.
 */
public class TestCaclProxy {
    @Test
    public void testCalculations() {
        CalculatorProxy calc = new CalculatorProxy();
        System.out.println(calc.add(3, 4));
        System.out.println(calc.sub(3, 4));
        System.out.println(calc.mult(3, 4));
        System.out.println(calc.div(3, 4));
    }

}
