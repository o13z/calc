import calc.template_taxes.TaxesOnePerson;
import calc.template_taxes.TaxesOnePersonIT;
import org.junit.Test;

public class TestTaxesOnePerson {

    @Test
    public void testOne() {
        System.out.println("====================================================");
        TaxesOnePerson onePerson = new TaxesOnePerson(100000);
        onePerson.calculateTaxes();
        System.out.println(onePerson.getAmount());
        System.out.println("====================================================");
    }

    @Test
    public void testOneIT() {
        System.out.println("====================================================");
        System.out.println("Salary income of an IT specialist");
        TaxesOnePersonIT onePersonIT = new TaxesOnePersonIT(100000);
        onePersonIT.calculateTaxes();
        System.out.println(onePersonIT.getAmount());
        System.out.println("====================================================");
    }
}
