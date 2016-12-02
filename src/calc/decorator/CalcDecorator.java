package calc.decorator;

import calc.proxy.ICalculator;

public abstract class CalcDecorator implements ICalculator {
	@Override
	public double mult(double x, double y) {
		return 0;
	}
}
