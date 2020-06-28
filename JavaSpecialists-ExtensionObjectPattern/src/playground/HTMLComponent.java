package playground;

public class HTMLComponent extends Component {

    public HTMLComponent() {
        register(TextAccessor.class,new HTMLTextAccessor(this));
    }

    //other HTML methods like replaceText(),getText(),size() etc

}
