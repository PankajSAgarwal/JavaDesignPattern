import java.util.List;
import java.util.stream.Collectors;

public class Parse {

    public static Element parse(List<Token> tokens){
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;

        for (int i = 0; i < tokens.size(); ++i) {
            Token token = tokens.get(i);
            switch (token.type){
                case INTEGER:
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if(!haveLHS) {
                        result.left = integer;
                        haveLHS = true;
                    }
                    else
                        result.right = integer;
                    break;


                case PLUS:
                     result.type = BinaryOperation.Type.ADDITION;
                        break;
                case MINUS:
                        result.type = BinaryOperation.Type.SUBTRACTION;
                    break;
                case LPAREN:
                    int j=0;//location of RPAREN
                    for (; j < tokens.size() ; ++j) {
                        if (tokens.get(j).type==Token.Type.RPAREN)
                            break;
                        List<Token> subExpression = tokens.stream()
                                .skip(i + 1)
                                .limit(j-i-1)
                                .collect(Collectors.toList());
                        Element element = parse(subExpression);
                        if(!haveLHS){
                            result.left = element;
                            haveLHS = true;
                        }else
                            result.right = element;
                        i = j;
                        break;
                    }
            }

        }
        return result;
    }
}
