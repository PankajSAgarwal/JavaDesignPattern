package playground;

public class StandardTextAccessor implements TextAccessor{
    private final TextComponent owner;

    public StandardTextAccessor(TextComponent owner) {
        this.owner = owner;
    }

    @Override
    public void seekTo(int pos) {
        //TODO
    }

    @Override
    public String readWord() {
        //TODO
        return null;
    }

    @Override
    public boolean isAtWord() {
        //TODO
        return false;
    }

    @Override
    public void changeWord(String word) {
        //TODO
    }
}
