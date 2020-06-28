
package exercise1;

public class TaxPayer {
    public static final TaxStrategy COMPANY = new CompanyTaxStrategy();
    public static final TaxStrategy EMPLOYEE = new EmployeeTaxStrategy();
    public static final TaxStrategy TRUST = new TrustTaxStrategy();

    private final TaxStrategy strategy;



    private final double income;
    //private final int type;

    public TaxPayer(TaxStrategy strategy, double income) {
        //this.type = type;
        this.strategy = strategy;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public double extortCash() {
        return strategy.extortCash(this);
    }
}
