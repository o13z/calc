package calc.observer;

import java.util.HashMap;
import java.util.Map;

public class MathOperationTypePrintObserver implements EventHandler {

	private static Map<String, String> mathOper = new HashMap<>();
	static {
        mathOper.put("mult", "multiplication");
        mathOper.put("div", "division");
		mathOper.put("sub", "subtraction");
        mathOper.put("add", "addtition");
	}

	@Override
	public void handleEvent(String operation) {
		System.out.println("A new " + mathOper.get(operation) + " operation:");
	}
}
