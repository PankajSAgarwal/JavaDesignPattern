package exercise1;

public class Company extends TaxPayer {
    private final boolean nonProfit;

    public Company(boolean nonProfit, double income) {
        super(income);
        this.nonProfit = nonProfit;
    }

    private boolean isNonProfit() {
        return nonProfit;
    }


    @Override
    protected double getTaxRate() {
        return 0.29;
    }

    @Override
    protected boolean isTaxExempt() {
        return isNonProfit() ;
    }

}
