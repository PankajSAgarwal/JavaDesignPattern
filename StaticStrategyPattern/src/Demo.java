import java.util.List;

public class Demo {

    public static void main(String[] args) {
        TextProcessor<MarkDownListStrategy> tp =
                new TextProcessor<>(MarkDownListStrategy::new);

        tp.appendList(List.of("alpha","beta","gamma"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2 =
                new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(List.of("alpha","beta","gamma"));

        System.out.println(tp2);

    }
}
