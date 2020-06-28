package exercise1;

public class Trust extends TaxPayer {
    private final boolean disability;


    public Trust(boolean disability, double income) {
        super(income);
        this.disability = disability;

    }

    public boolean isDisability() {
        return disability;
    }

    @Override
    protected double getTaxRate() {
        return 0.40;
    }



    @Override
    protected boolean isTaxExempt() {
        return disability ;
    }

}
