import calc.CalculatorImpl;
import calc.decorator.CalcWithPoweringAndExtraction;
import org.junit.Test;

public class TestDecorator {
    @Test
    public void testWithPoweringAndExtraction() {
        double x = 9; double y = 3; int n = 3;
        CalcWithPoweringAndExtraction calc = new CalcWithPoweringAndExtraction(new CalculatorImpl());
        System.out.println(calc.add(calc.mult(x, y), y));
        System.out.println(calc.add(x, y)); //addition
        System.out.println(calc.sub(x, y)); //subtraction
        System.out.println(calc.mult(x, y)); //multiplication
        System.out.println(calc.div(x, y)); //division
        System.out.println("----------------------------------------------");
        System.out.println(calc.inPower(x, n)); //inPower
        System.out.println("----------------------------------------------");
        System.out.println(calc.extraction(x));
        System.out.println(calc.extraction(y));

    }
}
