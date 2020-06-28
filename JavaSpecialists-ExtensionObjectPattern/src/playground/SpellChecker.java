package playground;

public class SpellChecker {

    // inside spellChecker
    public void spellCheck(Component doc){
        doc.getExtension(TextAccessor.class)
        .ifPresent(this::spellCheck);

    }

    private void spellCheck(TextAccessor ta) {
        while (ta.isAtWord()){
            String word = ta.readWord();
            String correct = autoCorrect(word);
            if(word != correct)
                ta.changeWord(correct);

        }
    }

    private String autoCorrect(String word) {
        return null;
    }
}
