package main.java.commandpattern;

public class TextFileExecutor implements ICommand {
    private static final String TEXT_FILE = "text";
    @Override
    public Boolean isValidCommand(String command) {
        return command.equalsIgnoreCase(TEXT_FILE);
    }

    @Override
    public void execute() {
         System.out.println("Invoking textfile parser");
    }
}
