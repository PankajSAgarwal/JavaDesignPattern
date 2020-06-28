package exercise1;

//DON'T CHANGE
public class PrintProcessor implements Processor<Object> {
    public boolean process(Object o) {
        System.out.println(">>> " + o);
        return true;
    }
}
