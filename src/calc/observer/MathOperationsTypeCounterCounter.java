package calc.observer;

import java.util.*;

public class MathOperationsTypeCounterCounter implements EventHandler {

    private List<String> operationsType;
    private static int numberOfOperations = 0;

    public MathOperationsTypeCounterCounter() {
        initOperaionsList();
    }

    private void initOperaionsList() {
        operationsType = new ArrayList();
        operationsType.addAll(Arrays.asList("mult", "div", "sub", "add", "pow", "ext"));
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }
    @Override
    public void handleEvent(String operation) {
        if(operationsType.contains(operation)) {
            numberOfOperations++;
        } else try {
            throw new Exception("Unknown operation type");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
