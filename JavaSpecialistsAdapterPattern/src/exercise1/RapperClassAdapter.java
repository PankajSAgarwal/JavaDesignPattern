package exercise1;

public class RapperClassAdapter extends Rapper implements Singer {

    @Override
    public void sing() {
        talk();
    }

}
