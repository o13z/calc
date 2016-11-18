package calc.observer;

import org.junit.Test;

public class TestObservers {
	@Test
	public void testEventHandler() {
		CalculationManager action = new CalculationManager();

		System.out.println(action.callToAdd(9, 3));
		System.out.println(action.callToSubtracion(9, 3));
		System.out.println(action.callToMultiply(9, 3));
		System.out.println(action.callToDivide(9, 3));
	}
}
