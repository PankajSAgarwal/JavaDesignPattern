import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BigCompany {

    private final Map<Employee, Deque<Memento>> history =
            new ConcurrentHashMap<>();

    public void promote(Employee employee){

        snapshot(employee);
        employee.promote();
    }

    public void pay(Employee employee){

        snapshot(employee);
        employee.pay();
    }

    private void snapshot(Employee employee) {

        Memento memento = employee.createMemento();
        history.computeIfAbsent(employee,k->new ConcurrentLinkedDeque<>())
        .addLast(memento);
    }

    public void undo(Employee employee){

        Memento m = history.getOrDefault(employee,new ArrayDeque<>()).pollLast();
        if(m != null) employee.setMemento(m);
    }
}
