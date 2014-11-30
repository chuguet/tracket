package com.hasl.tracket.model.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class AppException.
 */
public class DatabaseRetrieveException extends DatabaseException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new app exception.
	 */
	public DatabaseRetrieveException() {
		super();
	}

	/**
	 * Instantiates a new database delete exception.
	 * 
	 * @param e
	 *            the e
	 */
	public DatabaseRetrieveException(Exception e) {
		super(e);
	}

	/**
	 * Instantiates a new app exception.
	 * 
	 * @param message
	 *            the message
	 */
	public DatabaseRetrieveException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new database delete exception.
	 * 
	 * @param message
	 *            the message
	 * @param e
	 *            the e
	 */
	public DatabaseRetrieveException(String message, Exception e) {
		super(message, e);
	}
}