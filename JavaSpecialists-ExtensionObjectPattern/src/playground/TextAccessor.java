package playground;

public interface TextAccessor extends ComponentExtension{

    void seekTo(int pos);
    String readWord();
    boolean isAtWord();
    void changeWord(String word);
}
