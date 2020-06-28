package exercise1;

public abstract class TaxPayer <R,S,A,X extends Exception>{
    private final double income;

    public TaxPayer(double income) {
        this.income = income;
    }

    /**
     * This will become our template method.
     */
    public final double calculateTax() {
        return isTaxExempt() || getIncome() < 0 ?
                0.0 : getIncome() * getTaxRate();
    }

    protected final double getIncome(){
        return income;
    }


    protected abstract double getTaxRate() ;

    protected abstract boolean isTaxExempt();


}
