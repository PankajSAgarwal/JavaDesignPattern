package exercise1;

public  class ProgrammerState extends State {
    public int pay(Employee employee) {

        System.out.println("Programmer getting paid");
        return 3000;
    }

    public void advance(Employee employee) {
        employee.setState(new ManagerState());

    }

    public void fire(Employee employee) {
        employee.setState(new EndState());
        
    }


}
