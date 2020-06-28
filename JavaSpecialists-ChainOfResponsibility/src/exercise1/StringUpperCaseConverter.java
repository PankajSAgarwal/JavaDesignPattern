package exercise1;

public class StringUpperCaseConverter extends Converter{
    public StringUpperCaseConverter(Converter next) {
        super(next);
    }

    public Object handle(Object o) {
        // if the object is a String, we convert it to UpperCase
        if(o instanceof String){
            o=((String)o).toUpperCase();
        }
        return super.handle(o);
    }
}
