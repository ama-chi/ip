package Duke;

import java.util.Objects;

public class Parser {

    public Duke.Commands parseCommand(String input) {
        input = input.trim();
        if (Objects.equals(input.toLowerCase(), "bye")) {
            return Duke.Commands.BYE;
        } else if (Objects.equals(input.toLowerCase(), "list")) {
            return Duke.Commands.LIST;
        } else if (input.startsWith("mark")) {
            return Duke.Commands.MARK;
        } else if (input.startsWith("unmark")) {
            return Duke.Commands.UNMARK;
        } else if (input.startsWith("delete")) {
            return Duke.Commands.DELETE;
        } else if (input.startsWith("find")) {
            return Duke.Commands.FIND;
        } else {
            return Duke.Commands.CREATETASK;
        }
    }

}