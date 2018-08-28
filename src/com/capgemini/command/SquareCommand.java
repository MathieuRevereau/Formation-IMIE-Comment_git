package com.capgemini.command;

public class SquareCommand implements Command {
	
	public Integer square(Integer nb1){
		return nb1*nb1;
	}
	
	public Integer divide(Integer nb1, Integer nb2){
		return nb1/nb2;
	}
}
