package calc.template_taxes;

public abstract class TaxOperations {

    public final void calculateTaxes() {
        socialInsurance();
        medicalInsurance();
        personalTaxFree();
        incomeTax();
    }

    protected abstract void socialInsurance();
    protected abstract void medicalInsurance();
    protected abstract void personalTaxFree();
    protected abstract void incomeTax();

}
