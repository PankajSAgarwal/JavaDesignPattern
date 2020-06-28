package playground;

public class TextComponent extends Component {

    public TextComponent() {
        register(TextAccessor.class,new StandardTextAccessor(this));
    }
    // other standard text methods like replaceText(),getText(),size() etc

}
