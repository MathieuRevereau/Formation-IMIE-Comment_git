package com.capgemini.command;

import java.util.ArrayList;

public class CommandWorker {
	private ArrayList<Command> commandList = new List<Command>();

	public void addFunction(Command commandToAdd) {
		this.commandList.add(commandToAdd);
	}

	public int getCurrentIndex(Command command) {
		int result = this.commandList.indexOf(command);
		return result;
	}

	public Command getPrevious(Command currentCommand) {
		Command commandResult;
		int currentCommandIndex = getCurrentIndex(currentCommand);
		if (currentCommandIndex==0) {
			commandResult = this.commandList.get(commandList.size()-1);
		}else {
			commandResult = this.commandList.get(currentCommandIndex-1);
		}
		return commandResult;

	}
}
