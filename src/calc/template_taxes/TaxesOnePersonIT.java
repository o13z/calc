package calc.template_taxes;

import calc.CalculatorImpl;

public class TaxesOnePersonIT extends TaxOperations {
    private CalculatorImpl calc = new CalculatorImpl();
    private final double PERSONAL_TAX_FREE = 844;
    private final double IT_TAX_LIMIT = 8750;

    private double amount;

    public TaxesOnePersonIT(double amount){
        this.amount = amount;
    }

    @Override
    protected void socialInsurance() {
        System.out.println("Social insurance amount: " + calc.div(calc.mult(amount, 6), 100));
        amount = amount - calc.div(calc.mult(amount, 6), 100);
        System.out.println("Balance: " + amount);
        System.out.println("====================================================");
    }

    @Override
    protected void medicalInsurance() {
        System.out.println("Medical insurance: amount: " + calc.div(calc.mult(amount, 4.5), 100));
        amount = amount - calc.div(calc.mult(amount, 4.5), 100);
        System.out.println("Balance: " + amount);
        System.out.println("====================================================");
    }

    @Override
    protected void personalTaxFree() {
        System.out.println("Personal tax free: " + PERSONAL_TAX_FREE);
        amount = amount - 844;
        System.out.println("Taxable balance: " + amount);
        System.out.println("====================================================");
    }

    @Override
    protected void incomeTax() {
        double t = amount - IT_TAX_LIMIT;
        if (t < 1) {
            System.out.println("Taxable amount: " + t);
            System.out.println("Income tax: " + calc.div(calc.mult(t, 18), 100));
            amount = amount - calc.div(calc.mult(t, 18), 100);
            System.out.println("====================================================");
        } else {
            System.out.println("Taxable amount: " + IT_TAX_LIMIT);
            System.out.println("Income tax: " + calc.div(calc.mult(IT_TAX_LIMIT, 18), 100));
            amount = amount - calc.div(calc.mult(IT_TAX_LIMIT, 18), 100);
            System.out.println("====================================================");
        }
    }

    public double getAmount() {
        return amount+PERSONAL_TAX_FREE;
    }
}
