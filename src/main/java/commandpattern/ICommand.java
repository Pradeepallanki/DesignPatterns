package main.java.commandpattern;

public interface ICommand {
     Boolean isValidCommand(String command);
     void execute();
}
