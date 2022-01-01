package main.java.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class CommandMain {
    public static void main(String[] args) {
        avoidingIfElseLadderUsingCommandPattern("csv");
        avoidingIfElseLadderUsingCommandPattern("text");
    }

    private static void invokeFileParsersUsingIfElseLadder(String fileType) {
        if(fileType.equalsIgnoreCase("CSV")) {
            System.out.println("Invoking csv parser from if else");
        } else {
            System.out.println("Invoking textfile parser from if else");
        }
    }

    private static void avoidingIfElseLadderUsingCommandPattern(String fileType) {
        ICommand csvCommandExecutor = new CsvFileExecutor();
        ICommand textFileCommandExecutor = new TextFileExecutor();

        List<ICommand> commands = new ArrayList<>();
        commands.add(csvCommandExecutor);
        commands.add(textFileCommandExecutor);

        CommandExecutor commandExecutor = new CommandExecutor(commands);

        commandExecutor.executeAppropriateCommand(fileType);
    }
}
