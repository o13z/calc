package calc.observer;

import java.util.HashMap;
import java.util.Map;

public class MathOperationObserver implements EventHandler {

    private static Map<String, String> mathOper = new HashMap<>();
    static {
        mathOper.put("mult", "multiply");
        mathOper.put("div", "divide");
        mathOper.put("sub", "subtraction");
        mathOper.put("add", "sum");
    }

    @Override
    public void handleEvent(String operation) {
        System.out.println("A new " + mathOper.get(operation) + " operation:");
    }
}
