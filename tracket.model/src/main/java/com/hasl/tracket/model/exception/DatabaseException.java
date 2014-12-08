package com.hasl.tracket.model.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseException.
 */
public class DatabaseException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2542606946459689949L;

	/**
	 * Instantiates a new database exception.
	 */
	public DatabaseException() {
		super();
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param e
	 *            the e
	 */
	public DatabaseException(Exception e) {
		super(e);
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param message
	 *            the message
	 */
	public DatabaseException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new database exception.
	 *
	 * @param message
	 *            the message
	 * @param e
	 *            the e
	 */
	public DatabaseException(String message, Exception e) {
		super(message, e);
	}
}
