import calc.template_method.PowerCalculator;
import calc.template_method.TipCalculator;
import org.junit.Test;

public class TestTemplateMethod {

    @Test
    public void powerCalcTest() {
        PowerCalculator calc = new PowerCalculator(4, 3);
        calc.goCalc();
    }

    @Test
    public void tipCalcTest() {
        TipCalculator calc = new TipCalculator(25);
        calc.goCalc();
    }
}
