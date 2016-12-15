import calc.strategy.*;
import org.junit.Test;

public class TestStrategy {
    @Test
    public void testStrategy() {
        Context ctx = new Context();
        ctx.setStrategy(new ConcreteStrategyAdd());
        int rezAdd = ctx.executeStrategy(1, 2);
        System.out.println(rezAdd);

        ctx.setStrategy(new ConcreteStrategySubtract());
        int rezSub = ctx.executeStrategy(6, 2);
        System.out.println(rezSub);

        ctx.setStrategy(new ConcreteStrategyMultiply());
        int rezMult = ctx.executeStrategy(3, 2);
        System.out.println(rezMult);

        ctx.setStrategy(new ConcreteStrategyDivide());
        int rezDiv = ctx.executeStrategy(6, 2);
        System.out.println(rezDiv);




    }
}
