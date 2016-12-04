package calc.decorator;

import calc.ICalculator;

public abstract class CalcDecorator implements ICalculator {
	protected ICalculator calculator;

	public CalcDecorator(ICalculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public double add(double x, double y) {
		return calculator.add(x, y);
	}

	@Override
	public double sub(double x, double y) {
		return calculator.sub(x, y);
	}

	@Override
	public double mult(double x, double y) {
		return calculator.mult(x, y);
	}

	@Override
	public double div(double x, double y) {
		return calculator.div(x, y);
	}

	public double inPower(double x, int n) {
		double rez = x;
		for (int i = 1; i <= n; i++) {
			rez = rez * i;
		}
		return rez;
	}

	public double extraction (double x) {
		return Math.sqrt(x);
	}
}
