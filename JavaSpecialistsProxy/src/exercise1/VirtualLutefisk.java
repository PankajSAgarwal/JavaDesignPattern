package exercise1;

public class VirtualLutefisk implements Lutefisk{
    private Lutefisk realSubject;
    public VirtualLutefisk() {
    }

    @Override
    public void eat(){
        if(realSubject == null){
            realSubject = new RealLutefisk();
        }
        realSubject.eat();
    };
}
