package main.java.commandpattern;

public class CsvFileExecutor implements ICommand {

    private static final String CSV_FILE_TYPE = "csv";

    @Override
    public Boolean isValidCommand(String command) {
        return command.equalsIgnoreCase(CSV_FILE_TYPE);
    }

    @Override
    public void execute() {
         System.out.println("Invoking csv parser");
    }
}
