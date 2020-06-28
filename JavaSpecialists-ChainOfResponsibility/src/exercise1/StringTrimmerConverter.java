package exercise1;

public class StringTrimmerConverter extends Converter{

    public StringTrimmerConverter(Converter next) {
        super(next);
    }

    public Object handle(Object o) {
        // if the object is a String, we trim the whitespace
        if(o instanceof String){
            o=((String) o).trim();
        }
        return super.handle(o);
    }
}
