package calc.observer;

public class SumObserver implements EventHandler {
	@Override
	public void handleEvent(String s) {
		if (s.equals("sum")) System.out.println("A new sum operation:");
	}
}
