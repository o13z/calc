package calc.observer;

import java.util.HashMap;
import java.util.Map;

public class MathOperationsCounter implements EventHandler {
    private Map<String, Integer> counted;

    public MathOperationsCounter() {
        init();
    }

    private void init() {
        counted = new HashMap<>();
        counted.put("mult", 0);
        counted.put("div", 0);
        counted.put("sub", 0);
        counted.put("add", 0);
    }

    @Override
    public void handleEvent(String operation) {
        int i = counted.get(operation);
        i++;
        counted.put(operation, i);
        for (int oper : counted.values()) {
            System.out.println(oper);
        }
    }


}
