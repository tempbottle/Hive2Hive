package org.hive2hive.core.exceptions;

public class NoSessionException extends Exception {

	private static final long serialVersionUID = 4263677549436609207L;

	public NoSessionException() {
		super("You are not logged in.");
	}
}
