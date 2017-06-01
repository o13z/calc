package calc.template_taxes;

import calc.CalculatorImpl;

public class TaxesOnePerson extends TaxOperations {
    private CalculatorImpl calc = new CalculatorImpl();
    private final double PERSONAL_TAX_FREE = 844;

    private double amount;

    public TaxesOnePerson(double amount) {
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
        System.out.println("Income tax: " + calc.div(calc.mult(amount, 18), 100));
        amount = amount - calc.div(calc.mult(amount, 18), 100);
        System.out.println("====================================================");
    }

    public double getAmount() {
        return amount+PERSONAL_TAX_FREE;
    }
}
