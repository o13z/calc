package calc.observer;

/**
 * Created by Oleg Tofan on 11/18/2016.
 */
public class DivideObserver implements EventHandler {
	@Override
	public void handleEvent(String s) {
		if (s.equals("div")) System.out.println("A new divide operation:");
	}
}
