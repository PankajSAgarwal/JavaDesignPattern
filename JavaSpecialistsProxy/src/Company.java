public class Company {
    private final MoralFibre moralFibre;
    private final String name;
    private int cash;

    public Company(String name, int cash, MoralFibre moralFibre) {
        this.moralFibre = moralFibre;
        this.name = name;
        this.cash = cash;
    }

    public void makeMoney(){
        System.out.println("Make Money");
        cash += 5_00_000;
    }

    public void damageEnvironment(){
        System.out.println("Damage Environment");
        cash += 5_00_000;
    }

    public void becomeFocusOfMediaAttention(){
        System.out.println("Look how good we are ..");
        cash -= moralFibre.actSociallyResponsible();
        cash -= moralFibre.cleanupEnvironment();
        cash -= moralFibre.empowerEmployees();
    }

    @Override
    public String toString() {
        return "Company " +
                name + " has $ " +
                 cash ;
    }
}
