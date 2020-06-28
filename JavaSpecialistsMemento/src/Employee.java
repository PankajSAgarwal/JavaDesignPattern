public class Employee {

    public enum POSITION {TESTER,PROGRAMMER,MANAGER};
    private int salary = 1000;
    private int balance = 2000;

    private POSITION position = POSITION.TESTER;

    public void pay(){

        balance += salary;
    }

    public void promote(){

        switch (position){

            case TESTER:
                position = POSITION.PROGRAMMER;
                salary += 400;
                break;
            case PROGRAMMER:
                position = POSITION.MANAGER;
                salary *= 3;
                break;
            case MANAGER:
                salary *= 1.5;
                break;
        }
    }

    public Memento createMemento(){

        return new MementoImpl(this);
    }
    public void setMemento(Memento m){

        MementoImpl mi = (MementoImpl) m;

        this.salary = mi.salary;
        this.balance = mi.balance;
        this.position = mi.position;
    }

    private static class MementoImpl implements Memento{

        private final int salary;
        private final int balance;
        private final Employee.POSITION position;

        public MementoImpl(Employee employee){
            this.salary = employee.salary;
            this.balance = employee.balance;
            this.position = employee.position;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", balance=" + balance +
                ", position=" + position +
                '}';
    }
}
