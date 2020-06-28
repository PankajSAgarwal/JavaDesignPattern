package exercise1;

public class CompanyTaxStrategy implements TaxStrategy {
    private static final double COMPANY_RATE = 0.30;

    @Override
    public double extortCash(TaxPayer context) {
        return context.getIncome() * COMPANY_RATE;
    }
}
