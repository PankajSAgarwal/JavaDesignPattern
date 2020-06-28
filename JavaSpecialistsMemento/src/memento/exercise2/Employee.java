
package memento.exercise2;

import java.io.Serializable;

public class Employee implements Serializable {
    public enum Position {TESTER, PROGRAMMER, MANAGER}

    private int salary = 1000;
    private int balance = 2000;
    private Position position = Position.TESTER;

    public void pay() {
        balance += salary;
    }

    public void promote() {
        switch (position) {
            case TESTER:
                position = Position.PROGRAMMER;
                salary += 400;
                break;
            case PROGRAMMER:
                position = Position.MANAGER;
                salary *= 3;
                break;
            case MANAGER:
                salary *= 1.5;
                break;
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (balance != employee.balance) return false;
        if (position != employee.position) return false;

        return true;
    }

    private Object writeReplace(){

        return createMemento();
    }

    public Memento createMemento() {
        return new MementoImpl(this);
    }

    public void setMemento(Memento m) {
        MementoImpl mi = (MementoImpl) m;
        this.salary = mi.salary;
        this.balance = mi.balance;
        this.position = mi.position;
    }

    private static class MementoImpl implements Memento,Serializable {
        private final int salary;
        private final int balance;
        private final Position position;

        public MementoImpl(Employee employee) {
            this.salary = employee.salary;
            this.balance = employee.balance;
            this.position = employee.position;
        }

        private Object readResolve(){
            Employee employee = new Employee();
            employee.setMemento(this);
            return employee;
        }
    }
}
