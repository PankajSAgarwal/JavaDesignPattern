package exercise1;

public class ManagerState extends State{
    @Override
    public int pay(Employee employee) {
        System.out.println("Paying lots of $$$ to manager");
        return 30000;
    }

    @Override
    public void advance(Employee employee) {
        employee.setState(new RetireeState());
    }

    @Override
    public void fire(Employee employee) {
        employee.setState(new EndState());
    }

}
