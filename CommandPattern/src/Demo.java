import com.sun.tools.javac.util.List;

import java.util.Collections;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println("ba = " + ba);
        List<BankAccountCommand> commands = List.of(new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000)
        );
        for (Command command : commands) {
            command.call();
            System.out.println(ba);
        }

        for (Command command : commands.reverse()) {
            command.undo();
            System.out.println(ba);

        }
    }
}
