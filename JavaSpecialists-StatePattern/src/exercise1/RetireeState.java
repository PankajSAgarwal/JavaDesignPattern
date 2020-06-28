package exercise1;

public class RetireeState extends State {
    @Override
    public int pay(Employee employee) {
        System.out.println("Handing out crumbs to retiree");
        return 5000;
    }

    @Override
    public void advance(Employee employee) {

        employee.setState(new EndState());
    }

}
