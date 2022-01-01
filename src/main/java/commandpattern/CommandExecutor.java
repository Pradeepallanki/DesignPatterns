package main.java.commandpattern;

import java.util.List;

public class CommandExecutor {
    List<ICommand> commandExecutors;

    public CommandExecutor(List<ICommand> commandExecutors) {
        this.commandExecutors = commandExecutors;
    }

    public void addExecutor(ICommand ICommand) {
        commandExecutors.add(ICommand);
    }

    public void executeAppropriateCommand(String commandToBeExecuted) {
        for(ICommand command: commandExecutors) {
            if(command.isValidCommand(commandToBeExecuted)) {
                command.execute();
                break; // Break statement is needed when you are using command pattern for if else ladder, whenever one of the command executes, you need to exit the loop. How ever in case of multiple if statements, break is not needed.
            }
        }
    }
}
