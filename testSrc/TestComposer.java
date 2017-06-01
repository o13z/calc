import calc.CalculatorImpl;
import calc.ICalculator;
import calc.composer.Composite;
import calc.decorator.CalcWithPoweringAndExtraction;
import org.junit.Test;

public class TestComposer {

    @Test
    public void testCalculators() {
        Composite composite = new Composite();
        ICalculator simple = new CalculatorImpl();
        ICalculator engee = new CalcWithPoweringAndExtraction(simple);

        composite.addSimpleCalc(simple);
        composite.addEngeneerCalc(engee);

        System.out.println(composite.getSimple().add(55, 22));
        System.out.println(((CalcWithPoweringAndExtraction) composite.getIng()).inPower(2, 4));

        System.out.println("=======================================");
        composite.addSimpleCalc(simple);
        composite.addSimpleCalc(simple);
        composite.addSimpleCalc(simple);

        System.out.println("number of simple calc: " + composite.getNumSimpleCalc());
        System.out.println("number of engineering calc: " + composite.getNumEngeeCalc());
    }

}
