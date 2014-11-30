package com.hasl.tracket.model.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class AppException.
 */
public class DatabaseInsertException extends DatabaseException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5945347285324642156L;

	/**
	 * Instantiates a new app exception.
	 */
	public DatabaseInsertException() {
		super();
	}

	/**
	 * Instantiates a new database delete exception.
	 * 
	 * @param e
	 *            the e
	 */
	public DatabaseInsertException(Exception e) {
		super(e);
	}

	/**
	 * Instantiates a new app exception.
	 * 
	 * @param message
	 *            the message
	 */
	public DatabaseInsertException(String message) {
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
	public DatabaseInsertException(String message, Exception e) {
		super(message, e);
	}
}