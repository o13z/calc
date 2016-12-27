import calc.abstractFactory.CalcFactoryImpl;
import calc.abstractFactory.IMathAction;
import org.junit.Test;

public class TestFactory{
    @Test
    public void testFactoryCalc() {
        CalcFactoryImpl factory = new CalcFactoryImpl();
        IMathAction add = factory.operation('+');
        IMathAction sub = factory.operation('-');
        IMathAction mult = factory.operation('*');
        IMathAction div = factory.operation('/');

        System.out.println(add.doAction(2, 5));
        System.out.println(sub.doAction(2, 5));
        System.out.println(mult.doAction(2, 5));
        System.out.println(div.doAction(2, 5));

    }
}
