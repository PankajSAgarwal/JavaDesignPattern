package exercise1;

public class RapperObjectAdapter implements Singer {

    private final Rapper rapper;

    public RapperObjectAdapter(Rapper rapper) {
        this.rapper = rapper;
    }

    @Override
    public void sing() {
        rapper.talk();
    }
}
