package exercise1;

public class Employee extends TaxPayer {
    private final boolean foreignResident;


    public Employee(boolean foreignResident,
                    double income) {
        super(income);
        this.foreignResident = foreignResident;

    }

    private boolean isForeignResident() {

        return foreignResident;
    }



    @Override
    protected double getTaxRate() {
        if (getIncome() < 20000) {
            return 0.0;
        } else if (getIncome() < 50000) {
            return 0.1;
        } else if (getIncome() < 100000) {
            return 0.25;
        } else {
            return 0.45;
        }
    }

    @Override
    protected boolean isTaxExempt() {
        return isForeignResident();
    }
}
