package com.capgemini.exceptions;

public class InvalidAccountNumberException extends Exception {

	public InvalidAccountNumberException(String message){
		System.out.println(message);
	}
}
