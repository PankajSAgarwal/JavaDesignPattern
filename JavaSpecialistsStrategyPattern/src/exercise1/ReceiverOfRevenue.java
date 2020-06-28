
package exercise1;

//DON'T CHANGE
public class ReceiverOfRevenue {
    public static void main(String... args) {
        TaxPayer heinz, maxsol, family;
        heinz = new TaxPayer(TaxPayer.EMPLOYEE, 50000);
        maxsol = new TaxPayer(TaxPayer.COMPANY, 100000);
        family = new TaxPayer(TaxPayer.TRUST, 30000);
        TaxPayer girgois = new TaxPayer(tp -> 0,1_000_000_000);
        System.out.println(heinz.extortCash());
        System.out.println(maxsol.extortCash());
        System.out.println(family.extortCash());
        System.out.println(girgois.extortCash());
    }
}
