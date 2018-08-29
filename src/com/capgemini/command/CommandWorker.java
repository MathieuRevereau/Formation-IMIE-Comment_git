package com.capgemini.command;

import java.util.ArrayList;

public class CommandWorker {
	private ArrayList <Command> functionsList =  new ArrayList <Command>();
	
	public void addFunction(Command commandToAdd) {
		this.functionsList.add(commandToAdd);
	}
} 
