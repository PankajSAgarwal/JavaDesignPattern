package exercise1;

public class TrustTaxStrategy implements TaxStrategy {
    private static final double TRUST_RATE = 0.35;

    @Override
    public double extortCash(TaxPayer context) {
        return context.getIncome() * TRUST_RATE;
    }
}
