import calc.abstractFactory.CalcFactoryImpl;
import calc.abstractFactory.IMathAction;
import org.junit.Test;

public class TestFactory{
    @Test
    public void testFactoryCalc() {
        CalcFactoryImpl factory = new CalcFactoryImpl();
        IMathAction add = factory.createAdd();
        IMathAction sub = factory.createSub();
        IMathAction mult = factory.createMult();
        IMathAction div = factory.createDiv();

        System.out.println(add.doAction(3, 4));
        System.out.println(sub.doAction(3, 4));
        System.out.println(mult.doAction(3, 4));
        System.out.println(div.doAction(8, 4));
    }
}
