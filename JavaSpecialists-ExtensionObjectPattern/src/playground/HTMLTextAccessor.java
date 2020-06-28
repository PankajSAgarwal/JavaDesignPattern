package playground;

public class HTMLTextAccessor implements TextAccessor{

    private final HTMLComponent owner;

    public HTMLTextAccessor(HTMLComponent owner) {
        this.owner = owner;
    }

    @Override
    public void seekTo(int pos) {
        // TODO
    }

    @Override
    public String readWord() {
        // TODO
        return null;
    }

    @Override
    public boolean isAtWord() {
        // TODO
        return false;
    }

    @Override
    public void changeWord(String word) {
        // TODO
    }
}
