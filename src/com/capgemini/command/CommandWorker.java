package com.capgemini.command;

import java.util.ArrayList;

public class CommandWorker {
	private ArrayList <Command> commandList =  new ArrayList <Command>();
	
	public void addFunction(Command commandToAdd) {
		this.commandList.add(commandToAdd);
	}
	
	public int getCurrentIndex(Command command) {
		int result = this.commandList.indexOf(command);
		return result;
	}
	
	public Command getNext(Command currentCommand) {
		Command nextCommand;
		if (getCurrentIndex(currentCommand)+1<=commandList.size()) {
			nextCommand = commandList.get(getCurrentIndex(currentCommand)+1);	
		}
		else {
			nextCommand = commandList.get(0);
		}
		return nextCommand;
	}
} 
