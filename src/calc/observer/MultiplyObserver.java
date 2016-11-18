package calc.observer;

public class MultiplyObserver implements EventHandler{
	@Override
	public void handleEvent(String s) {
		if (s.equals("mult")) System.out.println("A new multiply operation:");
	}
}
