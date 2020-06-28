package exercise1;

public class EmployeeTaxStrategy implements TaxStrategy {
    private static final double EMPLOYEE_RATE = 0.45;

    @Override
    public double extortCash(TaxPayer context) {
        return context.getIncome() * EMPLOYEE_RATE;
    }
}
