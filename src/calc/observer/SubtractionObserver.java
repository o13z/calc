package calc.observer;

public class SubtractionObserver implements EventHandler{
	@Override
	public void handleEvent(String s) {
		if (s.equals("sub")) System.out.println("A new subtraction operation:");
	}
}
