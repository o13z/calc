package calc.composer;

import calc.ICalculator;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
    private List<ICalculator> simpleList = new ArrayList<>();
    private List<ICalculator> engeeList = new ArrayList<>();

    @Override
    public void addSimpleCalc(ICalculator c) {
        simpleList.add(c);
    }

    @Override
    public void addEngeneerCalc(ICalculator c) {
        engeeList.add(c);
    }

    @Override
    public ICalculator getSimple() {
        return simpleList.get(0);
    }

    @Override
    public ICalculator getIng() {
        return engeeList.get(0);
    }

    public ICalculator getSimple(int a) {
        return simpleList.get(a);
    }

    public ICalculator getIng(int a) {
        return engeeList.get(a);
    }

    public int getNumSimpleCalc() {
        return simpleList.size();
    }

    public int getNumEngeeCalc() {
        return engeeList.size();
    }
}
