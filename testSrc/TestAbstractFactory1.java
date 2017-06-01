import calc.abstractFactory1.CalcCreator;
import calc.abstractFactory1.CalcFactory;
import calc.decorator.CalcWithPoweringAndExtraction;
import org.junit.Test;

public class TestAbstractFactory1 {

    @Test
    public void testAbstractFactory() {
        CalcCreator creator = new CalcCreator(new CalcFactory());
        System.out.println(creator.getSimpleCalc().mult(2, 3));
        System.out.println(((CalcWithPoweringAndExtraction)creator.getSuperCalc()).inPower(2, 3));
    }

    @Test
    public void testNoCreator() {
        CalcFactory factory = new CalcFactory();
        System.out.println(factory.createSimpleCalc().mult(2, 4));
        System.out.println(((CalcWithPoweringAndExtraction)factory.createSuperCalc()).inPower(3, 2));
    }
}
