package exercise1;

public class DoubleTrimmerConverter extends Converter{
    public DoubleTrimmerConverter(Converter next) {
        super(next);
    }

    public Object handle(Object o) {
        // if the object is a Double, we trim to the nearest Integer,
        // but still return a Double instance
        if(o instanceof Double){
            o = (double)Math.round((Double) o);
        }
        return super.handle(o);
    }
}
