import calc.ICalculator;
import calc.decorator.CalcWithPoweringAndExtraction;
import calc.factoryMethod.SimpleCalcCreator;
import calc.factoryMethod.SuperCalcCreator;
import org.junit.Test;

public class TestFactoryMethod {

    @Test
    public void simpleCalcCreatorTest() {
        SimpleCalcCreator simpleCalcCreator = new SimpleCalcCreator();
        ICalculator calc = simpleCalcCreator.create();
        System.out.println(calc.mult(2, 3));
    }

    @Test
    public void superCalcCreatorTest() {
        SuperCalcCreator superCalcCreator = new SuperCalcCreator();
        ICalculator calc = superCalcCreator.create();
        System.out.println(((CalcWithPoweringAndExtraction) calc).inPower(4, 2));
        //or
        CalcWithPoweringAndExtraction calc1 = (CalcWithPoweringAndExtraction) superCalcCreator.create();
        System.out.println(calc1.inPower(3, 2));
    }
}
